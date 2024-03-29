package com.fitness.user.common.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.common.dao.UserKakaoDAO;
import com.fitness.user.common.vo.UserVO;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Service("userkakaoService")
public class UserKakaoServiceImpl implements UserKakaoService {
	
	@Autowired
	private UserKakaoDAO userKakaoDAO;

	@Override
	public String getAccessToken(String authorize_code) {
		String access_Token = "";
		String refresh_Token = "";
		
		String reqURL = "https://kauth.kakao.com/oauth/token";
		
		try {
			URL url = new URL(reqURL);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//POST 요청을 위해 기본값이 false 인 setDoput을 true로 
			conn.setRequestMethod("POST");
			conn.setDoOutput(true); 
			System.out.println("code : " + authorize_code);
			
			//POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			StringBuilder sb = new StringBuilder();
			sb.append("grant_type=authorization_code");
					   
			sb.append("&client_id=317680d5a011b0c1d9c69e3363dec15d");
						
			sb.append("&redirect_uri=http://localhost:8181/Fitnesscare/kakaoredirect.do");
						
			sb.append("&code=" + authorize_code);
			bw.write(sb.toString());
			bw.flush();
			
			// 결과 코드가 200이라면 선공
			int responseCode = conn.getResponseCode();
			System.out.println("responseCode :" + responseCode);
			
			// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			String result = "";
			while ((line = br.readLine()) != null) {
				result += line;
			}
			System.out.println("response body : " + result);
			
			//Gson 라이브러리에 포함된 클래스로 JSON 파싱 객체 생성
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(result);
			
			access_Token = element.getAsJsonObject().get("access_token").getAsString();
			refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();
			
			System.out.println("access_token : " + access_Token);
			System.out.println("refresh_token :" + refresh_Token);
			
			br.close();
			bw.close();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return access_Token;
	}

	@Override
	public HashMap<String, Object> getUserInfo(String access_Token) {
		 //    요청하는 클라이언트마다 가진 정보가 다를 수 있기에  HashMap타입으로 선언
	    HashMap<String, Object> userInfo = new HashMap<>();
	    String reqURL = "https://kapi.kakao.com/v2/user/me";
	    try {
	        URL url = new URL(reqURL);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestProperty("charset", "utf-8");
	        conn.setRequestMethod("POST");
	        
	        //    요청에 필요한 Header에 포함될 내용
//	        System.out.println("access_token : " + access_Token);
	        conn.setRequestProperty("Authorization", "Bearer " + access_Token.trim());	  
     
	        int responseCode = conn.getResponseCode();
	        System.out.println("responseCode : " + responseCode);
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	        
	        String line = "";
	        String result = "";
	        
	        while ((line = br.readLine()) != null) {
	            result += line;
	        }
	        System.out.println("response body : " + result);
	        
	        JsonParser parser = new JsonParser();
	        JsonElement element = parser.parse(result);
	        
	        JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
	        JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();
	        
	        String nickname = properties.getAsJsonObject().get("nickname").getAsString();
	        String email = kakao_account.getAsJsonObject().get("email").getAsString();
	        
	        userInfo.put("nickname", nickname);
	        userInfo.put("email", email);
	        
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    
	    return userInfo;
	}
	
	@Override
	public void insertKakaoUser(UserVO vo) {
		vo.setUser_loginMethod('K');
		System.out.println("service에서 insertKakaoUser 실행");
		userKakaoDAO.insertKakaoUser(vo);
	}

	@Override
	public UserVO getKakaoUser(UserVO vo) {
		System.out.println("service에서 getKakaoUser 실행");
		return userKakaoDAO.getKakaoUser(vo);
	}

	@Override
	public void logoutKakao(String access_Token) {
		String reqURL = "https://kapi.kakao.com/v1/user/logout";
		System.out.println("access_token : " + access_Token);
		try {
			URL url = new URL(reqURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", "Bearer " + access_Token);
			
			int responseCode = conn.getResponseCode();
			System.out.println("responseCode : " + responseCode);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String result = "";
			String line = "";
			
			while((line = br.readLine()) != null) {
				result += line;
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

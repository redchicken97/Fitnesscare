package com.fitess.common.user.service;

import java.util.HashMap;

import com.fitess.common.user.vo.UserVO;

public interface UserKakaoService {
	public String getAccessToken(String authorize_code);
	public HashMap<String, Object> getUserInfo (String access_Token);
	public void insertKakaoUser(UserVO vo);
}

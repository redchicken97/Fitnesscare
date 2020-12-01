package com.fitness.user.kakaoLogin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.common.user.vo.UserVO;

@Repository
public class UserKakaoDAOImpl implements UserKakaoDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemple;
	
	@Override
	public void insertKakaoUser(UserVO vo) {
		System.out.println("mybatis K_insert 실행");
		sqlSessionTemple.insert("UserDAO.insertKakaoUser", vo);
		//UserDAO는 매퍼의 namespace
	}

	@Override
	public UserVO getKakaoUser(UserVO vo) {
		System.out.println("mybatis K_getUser 실행");
		sqlSessionTemple.selectOne("UserDAO.getUser", vo);
		return null;
	}

}

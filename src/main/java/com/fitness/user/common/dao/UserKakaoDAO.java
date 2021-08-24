package com.fitness.user.common.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.common.vo.UserVO;

@Repository
public class UserKakaoDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemple;
	
	public void insertKakaoUser(UserVO vo) {
		System.out.println("mybatis K_insert 실행");
		sqlSessionTemple.insert("UserDAO.insertKakaoUser", vo);
		//UserDAO는 매퍼의 namespace
	}

	public UserVO getKakaoUser(UserVO vo) {
		System.out.println("mybatis K_getUser 실행");
		sqlSessionTemple.selectOne("UserDAO.getUser", vo);
		return null;
	}

}

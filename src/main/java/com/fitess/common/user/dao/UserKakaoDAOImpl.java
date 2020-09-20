package com.fitess.common.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitess.common.user.vo.UserVO;

@Repository
public class UserKakaoDAOImpl implements UserKakaoDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemple;
	
	@Override
	public void insertKakaoUser(UserVO vo) {
		System.out.println("mybatis K_insert 작동");
		sqlSessionTemple.insert("UserDAO.insertKakaoUser", vo);
		//UserDAO는 매퍼의 namespace
	}

}

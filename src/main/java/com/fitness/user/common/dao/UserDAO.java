package com.fitness.user.common.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.common.vo.UserVO;

@Repository
public class UserDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertUser(UserVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("UserDAO.insertUser", vo);
	}

	public void updateUser(UserVO vo) {
		System.out.println("mybatis update 실행");
		sqlSessionTemplate.update("UserDAO.updateUser", vo);
	}

	public void deleteUser(UserVO vo) {
		System.out.println("mybatis delete 실행");
		sqlSessionTemplate.delete("UserDAO.deleteUser", vo);
	}

	public UserVO getUser(UserVO vo) {
		System.out.println("mybatis get 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}

	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("mybatis getList 실행");
		return sqlSessionTemplate.selectList("UserDAO.getUserList");
	}
	
	public UserVO userLogin(String user_email) {
		System.out.println("mybatis login 실행");
		UserVO vo = new UserVO();
		vo.setUser_email(user_email);
		return sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}
	
	public int getUserCount() {
		System.out.println("mybatis getUserCount 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUserCount");
	}

}

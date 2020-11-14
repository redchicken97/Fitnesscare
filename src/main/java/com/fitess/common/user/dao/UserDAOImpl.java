package com.fitess.common.user.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitess.common.user.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertUser(UserVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("UserDAO.insertUser", vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		System.out.println("mybatis update 실행");
		sqlSessionTemplate.update("UserDAO.updateUser", vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		System.out.println("mybatis delete 실행");
		sqlSessionTemplate.delete("UserDAO.deleteUser", vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("mybatis get 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("mybatis getList 실행");
		return sqlSessionTemplate.selectList("UserDAO.getUserList");
	}

	@Override
	public UserVO userLogin(String user_email) {
		System.out.println("mybatis login 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUser", user_email);
	}

}

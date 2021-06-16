package com.fitness.user.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.user.common.dao.UserDAO;
import com.fitness.user.common.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void insertUser(UserVO vo) {
		System.out.println("service에서 insertUser 실행");
		userDAO.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		System.out.println("service에서 updateUser 실행");
		userDAO.updateUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		System.out.println("service에서 deleteUser 실행");
		userDAO.deleteUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("service에서 getUser 실행");
		return userDAO.getUser(vo);
	}

	@Override
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("service에서 getUserList 실행");
		return userDAO.getUserList(vo);
	}

	@Override
	public UserVO userLogin(String user_email) {
		System.out.println("service에서 userLogin 실행");
		return userDAO.userLogin(user_email);
	}
	
	@Override
	public int getUserCount() {
		System.out.println("service에서 getUserCount 실행");
		return userDAO.getUserCount();
	}

}

package com.fitness.admin.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.dao.UserDAO;
import com.fitness.admin.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void suspendUser(UserVO vo) {
		System.out.println("UserService.suspendUser 角青");
		userDAO.suspendUser(vo);
	}

	@Override
	public void unsuspendUser(UserVO vo) {
		System.out.println("UserService.unsuspendUser 角青");
		userDAO.unsuspendUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("UserService.getUser 角青");
		return userDAO.getUser(vo);
	}

	@Override
	public List<UserVO> getUserList(Criteria cri) {
		System.out.println("UserService.getUserList 角青");
		return userDAO.getUserList(cri);
	}
	
	@Override
	public int getUserCount() {
		System.out.println("UserService.getUserCount 角青");
		return userDAO.getUserCount();
	}

}

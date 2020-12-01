package com.fitness.admin.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.dao.UserManDAO;
import com.fitness.admin.user.vo.UserManVO;

@Service
public class UserManServiceImpl implements UserManService {

	@Autowired
	private UserManDAO userDAO;
	
	@Override
	public void suspendUser(UserManVO vo) {
		System.out.println("UserService.suspendUser 실행");
		userDAO.suspendUser(vo);
	}

	@Override
	public void unsuspendUser(UserManVO vo) {
		System.out.println("UserService.unsuspendUser 실행");
		userDAO.unsuspendUser(vo);
	}

	@Override
	public UserManVO getUserInfo(UserManVO vo) {
		System.out.println("UserService.getUserInfo 실행");
		return userDAO.getUserInfo(vo);
	}

	@Override
	public List<UserManVO> getUserInfoList(Criteria cri) {
		System.out.println("UserService.getUserInfoList 실행");
		return userDAO.getUserInfoList(cri);
	}
	
	@Override
	public int getUserCount() {
		System.out.println("UserService.getUserCount 실행");
		return userDAO.getUserCount();
	}

}

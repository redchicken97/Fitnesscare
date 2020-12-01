package com.fitness.admin.user.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.vo.UserManVO;

public interface UserManService {
	void suspendUser(UserManVO vo);
	void unsuspendUser(UserManVO vo);
	UserManVO getUserInfo(UserManVO vo);
	List<UserManVO> getUserInfoList(Criteria cri);
	int getUserCount();
}

package com.fitness.admin.user.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.vo.UserVO;

public interface UserService {
	void suspendUser(UserVO vo);
	void unsuspendUser(UserVO vo);
	UserVO getUser(UserVO vo);
	List<UserVO> getUserList(Criteria cri);
	int getUserCount();
}

package com.fitness.common.user.dao;

import com.fitness.common.user.vo.UserVO;

public interface UserKakaoDAO {

	public void insertKakaoUser(UserVO vo);
	public UserVO getKakaoUser(UserVO vo); 
}

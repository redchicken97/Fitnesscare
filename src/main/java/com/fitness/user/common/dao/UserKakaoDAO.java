package com.fitness.user.common.dao;

import com.fitness.user.common.vo.UserVO;

public interface UserKakaoDAO {

	public void insertKakaoUser(UserVO vo);
	public UserVO getKakaoUser(UserVO vo); 
}

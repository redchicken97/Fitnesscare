package com.fitness.user.kakaoMap.service;

import java.util.List;

import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

public interface HealthTeamJoinService {

	public void insertHealthTeamJoin(HealthTeamJoinVO vo);
	
	public List<HealthTeamJoinVO> getHealthTeamJoinList(HealthTeamJoinVO vo);
	
	public void deleteHealthTeamJoin(HealthTeamJoinVO vo);
}

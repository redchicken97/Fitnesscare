package com.fitness.user.kakaoMap.service;

import java.util.List;

import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

public interface HealthTeamJoinService {

	public List<HealthTeamJoinVO> insertGetListJoinTeam(HealthTeamJoinVO vo);
	
	public void deleteGetListHealthTeamJoin(HealthTeamJoinVO vo);
}

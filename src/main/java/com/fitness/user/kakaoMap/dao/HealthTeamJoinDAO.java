package com.fitness.user.kakaoMap.dao;

import java.util.List;

import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

public interface HealthTeamJoinDAO {
	
	public void insertGetListJoinTeam(HealthTeamJoinVO vo);
	
	public void deleteGetListHealthTeamJoin(HealthTeamJoinVO vo);
}

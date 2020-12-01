package com.fitness.user.kakaoMap.dao;

import java.util.List;

import com.fitness.user.kakaoMap.vo.HealthTeamVO;

public interface MapKakaoDAO {

	public void insertMap(HealthTeamVO vo);
	
	public List<HealthTeamVO> getMapList(HealthTeamVO vo);

	public HealthTeamVO getMap(int ht_id);
}

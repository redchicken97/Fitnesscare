package com.fitess.common.user.service;

import java.util.List;

import com.fitess.common.user.vo.HealthTeamVO;

public interface MapKakaoService {
	
	public void insertMap(HealthTeamVO vo);
	
	public List<HealthTeamVO> getMapList(HealthTeamVO vo);
	
	public HealthTeamVO getMap(int ht_id);
}

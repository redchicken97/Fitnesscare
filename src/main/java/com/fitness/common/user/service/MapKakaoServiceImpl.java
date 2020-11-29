package com.fitness.common.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.common.user.dao.MapKakaoDAO;
import com.fitness.common.user.vo.HealthTeamVO;

@Service("mapkakaoService")
public class MapKakaoServiceImpl implements MapKakaoService {
	
	@Autowired
	private MapKakaoDAO mapKakaoDAO;
	
	@Override
	public void insertMap(HealthTeamVO vo) {
		System.out.println("service insert 실행");
		mapKakaoDAO.insertMap(vo);
	}

	@Override
	public List<HealthTeamVO> getMapList(HealthTeamVO vo) {
		System.out.println("service getList 실행");
		return mapKakaoDAO.getMapList(vo);
	}

	@Override
	public HealthTeamVO getMap(int ht_id) {
		System.out.println("service get 실행");
		return mapKakaoDAO.getMap(ht_id);
	}

}

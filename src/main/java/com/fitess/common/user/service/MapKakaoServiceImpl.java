package com.fitess.common.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitess.common.user.dao.MapKakaoDAO;
import com.fitess.common.user.vo.HealthTeamVO;

@Service("mapkakaoService")
public class MapKakaoServiceImpl implements MapKakaoService {
	
	@Autowired
	private MapKakaoDAO mapKakaoDAO;
	
	@Override
	public void insertMap(HealthTeamVO vo) {
		System.out.println("service insert 작동");
		mapKakaoDAO.insertMap(vo);
	}

	@Override
	public List<HealthTeamVO> getMapList(HealthTeamVO vo) {
		System.out.println("service getList 작동");
		return mapKakaoDAO.getMapList(vo);
	}

	@Override
	public HealthTeamVO getMap(HealthTeamVO vo) {
		System.out.println("service get 작동");
		return mapKakaoDAO.getMap(vo);
	}

}

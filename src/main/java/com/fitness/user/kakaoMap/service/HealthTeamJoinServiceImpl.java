package com.fitness.user.kakaoMap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.kakaoMap.dao.HealthTeamJoinDAO;
import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

@Service("HealthTeamJoinService")
public class HealthTeamJoinServiceImpl implements HealthTeamJoinService {

	@Autowired
	private HealthTeamJoinDAO healthTeamJoinDAO;
	
	@Override
	public void insertHealthTeamJoin(HealthTeamJoinVO vo) {
		System.out.println("service insertJoin 실행");
		healthTeamJoinDAO.insertHealthTeamJoin(vo);
	}

	@Override
	public List<HealthTeamJoinVO> getHealthTeamJoinList(HealthTeamJoinVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHealthTeamJoin(HealthTeamJoinVO vo) {
		// TODO Auto-generated method stub

	}

}

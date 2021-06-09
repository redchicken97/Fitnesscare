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
	public List<HealthTeamJoinVO> insertGetListJoinTeam(HealthTeamJoinVO vo) {
		System.out.println("service insertJoin 실행");
		return healthTeamJoinDAO.insertGetListJoinTeam(vo);
	}

	@Override
	public void deleteGetListHealthTeamJoin(HealthTeamJoinVO vo) {
		System.out.println("service deleteJoin 실행");
		healthTeamJoinDAO.deleteGetListHealthTeamJoin(vo);
	}

}

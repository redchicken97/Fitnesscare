package com.fitness.user.kakaoMap.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

@Repository
public class HealthTeamJoinDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Transactional
	public List<HealthTeamJoinVO> insertGetListJoinTeam(HealthTeamJoinVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("healthTeamJoinDAO.insertHealthTeamJoin");
		
		return sqlSessionTemplate.selectList("healthTeamJoinDAO.getHealthTeamJoinList");
	}
	
	@Transactional
	public void deleteGetListHealthTeamJoin(HealthTeamJoinVO vo) {
		System.out.println("mybatis delete 실행");
		sqlSessionTemplate.delete("healthTeamJoinDAO.deleteHealthTeamJoin");
		sqlSessionTemplate.selectList("healthTeamJoinDAO.getHealthTeamJoinList");
	}
}

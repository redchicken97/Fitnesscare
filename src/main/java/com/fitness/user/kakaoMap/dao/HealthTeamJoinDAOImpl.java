package com.fitness.user.kakaoMap.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.kakaoMap.vo.HealthTeamJoinVO;

@Repository
public class HealthTeamJoinDAOImpl implements HealthTeamJoinDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertHealthTeamJoin(HealthTeamJoinVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("healthTeamJoinDAO.insertHealthTeamJoin");
	}

	@Override
	public List<HealthTeamJoinVO> getHealthTeamJoinList(HealthTeamJoinVO vo) {
		System.out.println("mybatis List 실행");
		return sqlSessionTemplate.selectList("healthTeamJoinDAO.getHealthTeamJoinList");
	}

	@Override
	public void deleteHealthTeamJoin(HealthTeamJoinVO vo) {
		System.out.println("mybatis delete 실행");
		sqlSessionTemplate.delete("healthTeamJoinDAO.deleteHealthTeamJoin");
	}

}

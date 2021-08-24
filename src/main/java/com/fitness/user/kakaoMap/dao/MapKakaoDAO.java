package com.fitness.user.kakaoMap.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.user.kakaoMap.vo.HealthTeamVO;

@Repository
public class MapKakaoDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertMap(HealthTeamVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("healthTeamDAO.insertHealthTeam", vo);
	}

	public List<HealthTeamVO> getMapList(HealthTeamVO vo) {
		System.out.println("mybatis List 실행");
		return sqlSessionTemplate.selectList("healthTeamDAO.getHealthTeamList");
	}

	public HealthTeamVO getMap(int ht_id) {
		System.out.println("mybatis get 실행");
		return sqlSessionTemplate.selectOne("healthTeamDAO.getHealthTeam", ht_id);
	}

}

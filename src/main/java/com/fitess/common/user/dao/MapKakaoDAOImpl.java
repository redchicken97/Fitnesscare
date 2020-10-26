package com.fitess.common.user.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitess.common.user.vo.HealthTeamVO;

@Repository
public class MapKakaoDAOImpl implements MapKakaoDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertMap(HealthTeamVO vo) {
		System.out.println("mybatis insert 작동");
		sqlSessionTemplate.insert("healthTeamDAO.insertHealthTeam", vo);
	}

	@Override
	public List<HealthTeamVO> getMapList(HealthTeamVO vo) {
		System.out.println("mybatis List 작동");
		return sqlSessionTemplate.selectList("healthTeamDAO.getHealthTeamList");
	}

	@Override
	public HealthTeamVO getMap(int ht_id) {
		System.out.println("mybatis get 작동");
		return sqlSessionTemplate.selectOne("healthTeamDAO.getHealthTeam", ht_id);
	}

}

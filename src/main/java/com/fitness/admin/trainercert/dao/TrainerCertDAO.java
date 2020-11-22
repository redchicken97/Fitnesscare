package com.fitness.admin.trainercert.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.trainercert.vo.TrainerCertVO;
import com.fitness.admin.user.vo.UserVO;

@Repository
public class TrainerCertDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// 전문가 인증 요청 승인
	public void acceptTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertDAO.acceptTrainerCert 실행");
		// user_level을 전문가('T')로 변경
		vo = this.getTrainerCert(vo);
		sqlSessionTemplate.update("TrainerCertDAO.acceptTrainerCert", vo);
		// 인증이 채택된 날짜 t_checkdate를 현재 시간으로 변경
		sqlSessionTemplate.update("TrainerCertDAO.setTCheckDate", vo);
	}
	
	// 전문가 인증 요청 거절
	public void declineTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertDAO.declineTrainerCert 실행");
		sqlSessionTemplate.delete("TrainerCertDAO.declineTrainerCert", vo);
	}
	
	public TrainerCertVO getTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertDAO.getTrainerCert 실행");
		return (TrainerCertVO)sqlSessionTemplate.selectOne("TrainerCertDAO.getTrainerCert", vo);
	}
	
	public List<TrainerCertVO> getTrainerCertList(Criteria cri) {
		System.out.println("TrainerCertDAO.getTrainerCertList 실행");
		
		Map map = new HashMap<>();
		map.put("startNum", cri.getStartNum());
		map.put("endNum", cri.getEndNum());
		map.put("cri", cri);
		
		return sqlSessionTemplate.selectList("TrainerCertDAO.getTrainerCertList", map);
	}
	
	public int getTrainerCertCount() {
		System.out.println("TrainerCertDAO.getTrainerCertCount 실행");
		return (int)sqlSessionTemplate.selectOne("TrainerCertDAO.getTrainerCertCount");
	}
	
}

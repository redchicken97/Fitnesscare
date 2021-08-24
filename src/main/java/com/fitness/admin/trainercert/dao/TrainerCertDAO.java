package com.fitness.admin.trainercert.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fitness.admin.trainercert.vo.TrainerCertVO;

@Repository
public class TrainerCertDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void applyTr(TrainerCertVO vo) {
		sqlSessionTemplate.insert("TrainerCertDAO.insertTrainerCert", vo);
	}

	@Transactional
	public void decisoinTr(TrainerCertVO vo) {		
		sqlSessionTemplate.update("TrainerCertDAO.acceptTrainerCert", vo);
		sqlSessionTemplate.update("TrainerCertDAO.setTCheckDate", vo);		
	}

	public List<TrainerCertVO> applyTrList() {
		return sqlSessionTemplate.selectList("TrainerCertDAO.applyTrainerList");
	}

	public List<TrainerCertVO> decisoinTrList() {
		return sqlSessionTemplate.selectList("TrainerCertDAO.getTrainerCertList");
	}

	@Transactional
	public void deleteTr(TrainerCertVO vo) {
		sqlSessionTemplate.update("TrainerCertDAO.relegationTrainerCert", vo);
		sqlSessionTemplate.delete("TrainerCertDAO.declineTrainerCert", vo);
	}

	public TrainerCertVO getTrainer(TrainerCertVO vo) {
		return sqlSessionTemplate.selectOne("TrainerCertDAO.getTrainerCert", vo);
	}

	
}

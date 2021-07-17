package com.fitness.admin.trainercert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.trainercert.dao.TrainerCertDAO;
import com.fitness.admin.trainercert.vo.TrainerCertVO;

@Service("trainerCertService")
public class TrainerCertServiceImpl implements TrainerCertService {
	
	@Autowired
	private TrainerCertDAO trainerCertDAO;

	@Override
	public void applyTr(TrainerCertVO vo) {
		trainerCertDAO.applyTr(vo);
	}

	@Override
	public void decisoinTr(TrainerCertVO vo) {
		trainerCertDAO.decisoinTr(vo);
	}

	@Override
	public List<TrainerCertVO> applyTrList() {
		return trainerCertDAO.applyTrList();
	}

	@Override
	public List<TrainerCertVO> decisoinTrList() {
		return trainerCertDAO.decisoinTrList();
	}

	@Override
	public void deleteTr(TrainerCertVO vo) {
		trainerCertDAO.deleteTr(vo);
	}

	@Override
	public TrainerCertVO getTrainer(TrainerCertVO vo) {
		return trainerCertDAO.getTrainer(vo);
	}

}

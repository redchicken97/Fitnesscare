package com.fitness.admin.trainercert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.trainercert.dao.TrainerCertDAO;
import com.fitness.admin.trainercert.vo.TrainerCertVO;

@Service
public class TrainerCertServiceImpl implements TrainerCertService {

	@Autowired
	private TrainerCertDAO trainerCertDAO;
	
	@Override
	public void acceptTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertService.acceptTrainerCert 실행");
		trainerCertDAO.acceptTrainerCert(vo);
	}

	@Override
	public void declineTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertService.declineTrainerCert 실행");
		trainerCertDAO.declineTrainerCert(vo);
	}

	@Override
	public TrainerCertVO getTrainerCert(TrainerCertVO vo) {
		System.out.println("TrainerCertService.getTrainerCert 실행");
		return trainerCertDAO.getTrainerCert(vo);
	}

	@Override
	public List<TrainerCertVO> getTrainerCertList(Criteria cri) {
		System.out.println("TrainerCertService.getTrainerCertList 실행");
		return trainerCertDAO.getTrainerCertList(cri);
	}
	
	@Override
	public int getTrainerCertCount() {
		System.out.println("TrainerCertService.getTrainerCertCount 실행");
		return trainerCertDAO.getTrainerCertCount();
	}

}

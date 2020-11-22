package com.fitness.admin.trainercert.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.trainercert.vo.TrainerCertVO;

public interface TrainerCertService {
	void acceptTrainerCert(TrainerCertVO vo);
	void declineTrainerCert(TrainerCertVO vo);
	TrainerCertVO getTrainerCert(TrainerCertVO vo);
	List<TrainerCertVO> getTrainerCertList(Criteria cri);
	int getTrainerCertCount();
}

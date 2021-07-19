package com.fitness.admin.trainercert.service;

import java.util.List;

import com.fitness.admin.trainercert.vo.TrainerCertVO;

public interface TrainerCertService {

	//신청 메소드
	public void applyTr(TrainerCertVO vo);
	
	//허가 메소드
	public void decisoinTr(TrainerCertVO vo);
	
	//신청자 리스트
	public List<String> applyTrList();
	
	//허가된 사람 리스트
	public List<TrainerCertVO> decisoinTrList();
	
	//강등 및 삭제
	public void deleteTr(TrainerCertVO vo);
	
	//트레이너 정보 가져오기
	public TrainerCertVO getTrainer(TrainerCertVO vo);
	
}

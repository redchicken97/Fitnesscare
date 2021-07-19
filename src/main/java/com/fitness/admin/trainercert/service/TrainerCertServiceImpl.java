package com.fitness.admin.trainercert.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.trainercert.dao.TrainerCertDAO;
import com.fitness.admin.trainercert.vo.TrainerCertVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

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
	public List<String> applyTrList() {
		JsonObject List1 = new JsonObject();
		List<String> List2 = new ArrayList<String>();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
			
		for (TrainerCertVO vo : trainerCertDAO.applyTrList()) {
			
			String createDate = sdFormat.format(vo.getT_createDate());
			String applyDate = sdFormat.format(vo.getT_applyDate());
			String checkDate = sdFormat.format(vo.getT_checkDate());
			
			List1.addProperty("t_id", vo.getT_id());
			List1.addProperty("user_id", vo.getUser_id());
			List1.addProperty("t_picture_link", vo.getT_picture_link());
			List1.addProperty("t_cname", vo.getT_cname());
			List1.addProperty("t_company", vo.getT_company());
			List1.addProperty("t_createDate", createDate);
			List1.addProperty("t_clink", vo.getT_clink());
			List1.addProperty("t_applyDate", applyDate);
			List1.addProperty("t_checkDate", checkDate);
			
			String json = gson.toJson(List1);
			
			List2.add(json);
		}
		
		return List2;
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

package com.fitness.admin.veboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.veboard.dao.VEBoardDAO;
import com.fitness.admin.veboard.vo.VEBoardVO;

@Service
public class VEBoardServiceImpl implements VEBoardService {
	
	@Autowired
	private VEBoardDAO vEBoardDAO;

	@Override
	public void insertVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardService.insertVEBoard 실행");
		vEBoardDAO.insertVEBoard(vo);
	}

	@Override
	public void updateVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardService.updateVEBoard 실행");
		vEBoardDAO.updateVEBoard(vo);
	}
	
	@Override
	public void deleteVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardService.deleteVEBoard 실행");
		vEBoardDAO.deleteVEBoard(vo);
	}
	
	@Override
	public VEBoardVO getVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardService.getVEBoard 실행");
		return vEBoardDAO.getVEBoard(vo);
	}

	@Override
	public List<VEBoardVO> getVEBoardList(Criteria cri) {
		System.out.println("VEBoardService.getVEBoardList 실행");
		return vEBoardDAO.getVEBoardList(cri);
	}

	@Override
	public int getVEBoardCount() {
		System.out.println("VEBoardService.getVEBoardCount 실행");
		return vEBoardDAO.getVEBoardCount();
	}

}

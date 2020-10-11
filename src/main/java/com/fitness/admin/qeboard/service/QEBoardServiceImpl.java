package com.fitness.admin.qeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.qeboard.dao.QEBoardDAO;
import com.fitness.admin.qeboard.vo.QEBoardVO;

@Service
public class QEBoardServiceImpl implements QEBoardService {

	@Autowired
	private QEBoardDAO qEBoardDAO;
	
	@Override
	public void insertQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardService.insertQEBoard 실행");
		qEBoardDAO.insertQEBoard(vo);
	}

	@Override
	public void updateQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardService.updateQEBoard 실행");
		qEBoardDAO.updateQEBoard(vo);
	}
	/* 추후 구현
	@Override
	public void deleteQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardService.deleteQEBoard 실행");
		qEBoardDAO.deleteQEBoard(vo);
	}
	*/
	@Override
	public QEBoardVO getQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardService.getQEBoard 실행");
		return qEBoardDAO.getQEBoard(vo);
	}

	@Override
	public List<QEBoardVO> getQEBoardList(Criteria cri) {
		System.out.println("QEBoardService.getQEBoardList 실행");
		return qEBoardDAO.getQEBoardList(cri);
	}
	
	@Override
	public int getQEBoardCount() {
		System.out.println("QEBoardService.getQEBoardCount 실행");
		return qEBoardDAO.getQEBoardCount();
	}

}

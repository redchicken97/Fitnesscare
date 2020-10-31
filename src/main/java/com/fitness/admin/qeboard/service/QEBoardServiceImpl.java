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
	
	@Override
	public void deleteQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardService.deleteQEBoard 실행");
		// comment 연쇄 삭제하는 로직이 들어와야함
		// commentDAO,deleteComment(vo);
		// 파라미터 타입 : QEBoardVO, 반환 타입 : void
		// 파라미터 타입이 vo여야 하는 이유는 q_id와 q_type 2가지를 비교해야하기때문
		qEBoardDAO.deleteQEBoard(vo);
	}
	
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

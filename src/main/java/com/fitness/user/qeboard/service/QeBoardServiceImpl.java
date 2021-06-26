package com.fitness.user.qeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.user.qeboard.dao.QeBoardDAO;
import com.fitness.user.qeboard.vo.QeBoardVO;

@Service
public class QeBoardServiceImpl implements QeBoardService {

	@Autowired
	private QeBoardDAO qeBoardDAO;
	
	@Override
	public void insertQeBoard(QeBoardVO vo) {
		System.out.println("service 질문 게시판 글 입력");
		qeBoardDAO.insertQeBoard(vo);
	}

	@Override
	public QeBoardVO getQeBoard(QeBoardVO vo) {
		System.out.println("service 질문 게시판 글 하나 가져오기");
		return qeBoardDAO.getQeBoard(vo);
	}

	@Override
	public List<QeBoardVO> getQeBoardList(QeBoardVO vo) {
		System.out.println("service 질문 게시판 전체 글 가져오기");
		return qeBoardDAO.getQeBoardList(vo);
	}

	@Override
	public void deleteQeBoard(QeBoardVO vo) {
		System.out.println("service 질문 게시판 글 삭제");
		qeBoardDAO.deleteQeBoard(vo);
	}

	@Override
	public void updateBoard(QeBoardVO vo) {
		System.out.println("service 질문 게시판 글 수정");
		qeBoardDAO.updateBoard(vo);
	}

}

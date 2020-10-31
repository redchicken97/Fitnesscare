package com.fitness.admin.qeboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.qeboard.vo.QEBoardVO;

@Repository
public class QEBoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardDAO.insertQEBoard 角青");
		sqlSessionTemplate.insert("QEBoardDAO.insertQEBoard", vo);
	}
	
	public void updateQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardDAO.updateQEBoard 角青");
		sqlSessionTemplate.update("QEBoardDAO.updateQEBoard", vo);
	}
	
	public void deleteQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardDAO.deleteQEBoard 角青");
		sqlSessionTemplate.delete("QEBoardDAO.deleteQEBoard", vo);
	}
	
	public QEBoardVO getQEBoard(QEBoardVO vo) {
		System.out.println("QEBoardDAO.getQEBoard 角青");
		return (QEBoardVO)sqlSessionTemplate.selectOne("QEBoardDAO.getQEBoard", vo);
	}
	
	public List<QEBoardVO> getQEBoardList(Criteria cri) {
		System.out.println("QEBoardDAO.getQEBoardList 角青");
		return sqlSessionTemplate.selectList("QEBoardDAO.getQEBoardList", cri);
	}
	
	public int getQEBoardCount() {
		System.out.println("QEBoardDAO.getQEBoardCount 角青");
		return (int)sqlSessionTemplate.selectOne("QEBoardDAO.getQEBoardCount");
	}
	
}

package com.fitness.admin.comment.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.comment.vo.CommentVO;

@Repository
public class CommentDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertComment(CommentVO vo) {
		System.out.println("CommentDAO.insertComment 실행");
		sqlSessionTemplate.insert("CommentDAO.insertComment", vo);
	}
	
	public void updateComment(CommentVO vo) {
		System.out.println("CommentDAO.updateComment 실행");
		sqlSessionTemplate.update("CommentDAO.updateComment", vo);
	}
	
	public void deleteComment(CommentVO vo) {
		System.out.println("CommentDAO.deleteComment 실행");
		sqlSessionTemplate.delete("CommentDAO.deleteComment", vo);
	}
	
	public CommentVO getComment(CommentVO vo) {
		System.out.println("CommentDAO.getComment 실행");
		return (CommentVO)sqlSessionTemplate.selectOne("CommentDAO.getComment", vo);
	}
	
	public List<CommentVO> getCommentList(CommentVO vo) {
		System.out.println("CommentDAO.getCommentList 실행");
		return sqlSessionTemplate.selectList("CommentDAO.getCommentList", vo);
	}
	
}

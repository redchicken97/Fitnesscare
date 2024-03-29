package com.fitness.user.comment.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.user.comment.vo.CommentInfoVO;

@Repository
public class UserCommentDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertComment(CommentInfoVO vo) {
		System.out.println("mybatis insertComment 실행");
		sqlSessionTemplate.insert("commentDAO.insertComment", vo);
	}
	
	@Transactional
	public void seReInsertComment(CommentInfoVO vo) {
		
		System.out.println("mybatis reInsertComment 실행");
		CommentInfoVO in = new CommentInfoVO();		// insert 용 vo
		CommentInfoVO up = new CommentInfoVO();		// update 용 vo
		CommentInfoVO se = new CommentInfoVO();		// step update용 
		
		in.setTarget_id(vo.getTarget_id());
		in.setCmt_type(vo.getCmt_type());
		in.setUser_id(vo.getUser_id());
		in.setCmt_ref(vo.getCmt_ref());
		in.setCmt_step(vo.getCmt_step());
		in.setCmt_depth(vo.getCmt_depth());
		in.setCmt_content(vo.getCmt_content());
		
		System.out.println(in.toString());
		
		up.setCmt_id(vo.getCmt_id());
		
		se.setCmt_step(vo.getCmt_step());
		
		System.out.println(up.toString());
		sqlSessionTemplate.insert("commentDAO.reInsertComment", in);
		sqlSessionTemplate.update("commentDAO.checkUpdateComment", up);
		sqlSessionTemplate.update("commentDAO.updateStep", se);
	}
	
	@Transactional
	public void reInsertComment(CommentInfoVO vo) {
		System.out.println("mybatis reInsertComment 실행");
		CommentInfoVO in = new CommentInfoVO();		// insert 용 vo
		CommentInfoVO up = new CommentInfoVO();		// update 용 vo
		
		in.setTarget_id(vo.getTarget_id());
		in.setCmt_type(vo.getCmt_type());
		in.setUser_id(vo.getUser_id());
		in.setCmt_ref(vo.getCmt_ref());
		in.setCmt_step(vo.getCmt_step());
		in.setCmt_depth(vo.getCmt_depth());
		in.setCmt_content(vo.getCmt_content());
		
		System.out.println(in.toString());
		
		up.setCmt_id(vo.getCmt_id());
		
		System.out.println(up.toString());
		sqlSessionTemplate.insert("commentDAO.reInsertComment", in);
		sqlSessionTemplate.update("commentDAO.checkUpdateComment", up);
	}
	
	//페이징 넣은 List
	public List<CommentInfoVO> getCommentListPaging(Criteria cri){
		return sqlSessionTemplate.selectList("commentDAO.getCommentListPaging", cri);
	}
	
	/*
	public List<CommentInfoVO> getCommentList() {
		System.out.println("mybatis getCommentList 실행");
		return sqlSessionTemplate.selectList("commentDAO.getCommentList");
	}
	*/	
		
	public CommentInfoVO getComment(CommentInfoVO vo) {
		System.out.println("mybatis getComment 실행");
		return sqlSessionTemplate.selectOne("commentDAO.getComment", vo);
	}

	public void updateComment(CommentInfoVO vo) {
		System.out.println("mybatis updateComment 실행");
		sqlSessionTemplate.update("commentDAO.updateComment", vo);
	}

	// 추천수 증가 
	public void upRdCnt(CommentInfoVO vo) {
		System.out.println("mybatis 추천 증가");
		sqlSessionTemplate.update("commentDAO.upRdCnt", vo);
	}

	// 신고수 증가
	public void upReportCnt(CommentInfoVO vo) {
		System.out.println("mybatis 신고 증가");
		sqlSessionTemplate.update("commentDAO.upReportCnt", vo);
	}
	
	// 대댓글 확인용 업데이트
	public void checkUpdateComment(CommentInfoVO vo) {
		System.out.println("mybatis check comment 실행");
		sqlSessionTemplate.update("commentDAO.checkUpdateComment", vo);
	}

	//댓글 총 갯수 확인용
	public int getCommentCount() {
		return (int)sqlSessionTemplate.selectOne("commentDAO.getCommentCount");
	}
}

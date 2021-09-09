
package com.fitness.user.comment.service;

import java.util.List;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.user.comment.vo.CommentInfoVO;

public interface UserCommentService {
	
	public void insertComment(CommentInfoVO vo);
	
	public void reInsertComment(CommentInfoVO vo);
	
	public List<String> getCommentListPaging(Criteria cri);
	
//	public List<String> getCommentList(CommentInfoVO vo);
	
	public CommentInfoVO getComment(CommentInfoVO vo);
	
	public void updateComment(CommentInfoVO vo);
	
	public void checkUpdateComment(CommentInfoVO vo);
	
	public void upRdCnt(CommentInfoVO vo);
	
	public void upReportCnt(CommentInfoVO vo);

	public void seReInsertComment(CommentInfoVO vo);
	
	public int getCommentCount();
}

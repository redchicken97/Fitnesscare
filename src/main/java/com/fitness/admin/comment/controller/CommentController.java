package com.fitness.admin.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.admin.comment.service.CommentService;
import com.fitness.admin.comment.vo.CommentVO;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public ResponseEntity<String> insertComment(@RequestBody CommentVO vo) {
		ResponseEntity<String> entity = null;
		try {
			commentService.insertComment(vo);
			entity = new ResponseEntity<>("insertSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value="/comments/{target_id}", method=RequestMethod.GET)
	public ResponseEntity<List<CommentVO>> getCommentList(
			@PathVariable int target_id,
			@RequestBody CommentVO vo){ 
		ResponseEntity<List<CommentVO>> entity = null;
		try {
			entity = new ResponseEntity<>(commentService.getCommentList(vo), HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value="/{cmt_id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> updateComment(
			@PathVariable("cmt_id") int cmt_id,
			@RequestBody CommentVO vo){
		ResponseEntity<String> entity = null;
		try {
			vo.setCmt_id(cmt_id);
			commentService.updateComment(vo);
			entity = new ResponseEntity<>("updateSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value="/{cmt_id}", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteComment(
			@PathVariable int cmt_id,
			@RequestBody CommentVO vo){
		ResponseEntity<String> entity = null;
		try {
			commentService.deleteComment(vo);
			entity = new ResponseEntity<>("deleteSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
}












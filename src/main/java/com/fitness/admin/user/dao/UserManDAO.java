package com.fitness.admin.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.vo.UserManVO;

@Repository
public class UserManDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// 계정 정지 메서드
	public void suspendUser(UserManVO vo) {
		System.out.println("UserManDAO.suspendUser 실행");
		sqlSessionTemplate.update("UserManDAO.suspendUser", vo);
	}
	
	// 계정 정지 해제 메서드
	public void unsuspendUser(UserManVO vo) {
		System.out.println("UserManDAO.unsuspendUser 실행");
		sqlSessionTemplate.update("UserManDAO.unsuspendUser", vo);
	}
	
	public UserManVO getUserInfo(UserManVO vo) {
		System.out.println("UserManDAO.getUserInfo 실행");
		return (UserManVO)sqlSessionTemplate.selectOne("UserManDAO.getUserInfo", vo);
	}
	
	public List<UserManVO> getUserInfoList(Criteria cri) {
		System.out.println("UserManDAO.getUserInfoList 실행");
		Map map = new HashMap();
		map.put("cri", cri);
		map.put("startNum", cri.getStartNum());
		map.put("endNum", cri.getEndNum());
		return sqlSessionTemplate.selectList("UserManDAO.getUserInfoList", cri);
	}
	
	public int getUserCount() {
		System.out.println("UserManDAO.getUserCount 실행");
		return (int)sqlSessionTemplate.selectOne("UserManDAO.getUserCount");
	}
	
}

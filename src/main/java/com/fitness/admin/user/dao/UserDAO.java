package com.fitness.admin.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.user.vo.UserVO;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// 계정 정지 메서드
	public void suspendUser(UserVO vo) {
		System.out.println("UserDAO.suspendUser 실행");
		sqlSessionTemplate.update("UserDAO.suspendUser", vo);
	}
	
	// 계정 정지 해제 메서드
	public void unsuspendUser(UserVO vo) {
		System.out.println("UserDAO.unsuspendUser 실행");
		sqlSessionTemplate.update("UserDAO.unsuspendUser", vo);
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("UserDAO.getUser 실행");
		return (UserVO)sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}
	
	public List<UserVO> getUserList(Criteria cri) {
		System.out.println("UserDAO.getUserList 실행");
		Map map = new HashMap();
		map.put("cri", cri);
		map.put("startNum", cri.getStartNum());
		map.put("endNum", cri.getEndNum());
		return sqlSessionTemplate.selectList("UserDAO.getUserList", cri);
	}
	
	public int getUserCount() {
		System.out.println("UserDAO.getUserCount 실행");
		return (int)sqlSessionTemplate.selectOne("UserDAO.getUserCount");
	}
	
}

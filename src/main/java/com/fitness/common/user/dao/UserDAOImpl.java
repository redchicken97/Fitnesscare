package com.fitness.common.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.common.user.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertUser(UserVO vo) {
		System.out.println("mybatis insert 실행");
		sqlSessionTemplate.insert("UserDAO.insertUser", vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		System.out.println("mybatis update 실행");
		sqlSessionTemplate.update("UserDAO.updateUser", vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		System.out.println("mybatis delete 실행");
		sqlSessionTemplate.delete("UserDAO.deleteUser", vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("mybatis get 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}

	@Override
	public List<UserVO> getUserList(Criteria cri) {
		System.out.println("mybatis getList 실행");
		Map map = new HashMap();
		map.put("startNum", cri.getStartNum());
		map.put("endNum", cri.getEndNum());
		map.put("cri", cri);
		return sqlSessionTemplate.selectList("UserDAO.getUserList", map);
	}

	@Override
	public UserVO userLogin(String user_email) {
		System.out.println("mybatis login 실행");
		UserVO vo = new UserVO();
		vo.setUser_email(user_email);
		return sqlSessionTemplate.selectOne("UserDAO.getUser", vo);
	}
	
	@Override
	public int getUserCount() {
		System.out.println("mybatis getUserCount 실행");
		return sqlSessionTemplate.selectOne("UserDAO.getUserCount");
	}

}

package com.fitness.admin.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.admin.vo.AdminVO;

@Repository
public class AdminDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertAdmin(AdminVO vo) {
		System.out.println("AdminDAO.insertAdmin 角青");
		sqlSessionTemplate.insert("AdminDAO.insertAdmin", vo);
	}
	
	public void updateAdmin(AdminVO vo) {
		System.out.println("AdminDAO.updateAdmin 角青");
		sqlSessionTemplate.update("AdminDAO.updateAdmin", vo);
	}
	
	public void deleteAdmin(AdminVO vo) {
		System.out.println("AdminDAO.deleteAdmin 角青");
		sqlSessionTemplate.delete("AdminDAO.deleteAdmin", vo);
	}
	
	public AdminVO getAdmin(AdminVO vo) {
		System.out.println("AdminDAO.getAdmin 角青");
		return (AdminVO)sqlSessionTemplate.selectOne("AdminDAO.getAdmin", vo);
	}
	
	public List<AdminVO> getAdminList(AdminVO vo) {
		System.out.println("AdminDAO.getAdminList 角青");
		return sqlSessionTemplate.selectList("AdminDAO.getAdminList", vo);
	}
	
}

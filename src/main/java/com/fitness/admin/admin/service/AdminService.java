package com.fitness.admin.admin.service;

import java.util.List;

import com.fitness.admin.admin.vo.AdminVO;

public interface AdminService {
	void insertAdmin(AdminVO vo);
	void updateAdmin(AdminVO vo);
	void deleteAdmin(AdminVO vo);
	AdminVO getAdmin(AdminVO vo);
	List<AdminVO> getAdminList(AdminVO vo);
}

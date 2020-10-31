package com.fitness.admin.veboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fitness.admin.common.paging.Criteria;
import com.fitness.admin.veboard.vo.VEBoardVO;

@Repository
public class VEBoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardDAO.insertVEBoard 角青");
		sqlSessionTemplate.insert("VEBoardDAO.insertVEBoard", vo);
	}
	
	public void updateVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardDAO.updateVEBoard 角青");
		sqlSessionTemplate.update("VEBoardDAO.updateVEBoard", vo);
	}
	
	public void deleteVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardDAO.deleteVEBoard 角青");
		sqlSessionTemplate.delete("VEBoardDAO.deleteVEBoard", vo);
	}
	
	public VEBoardVO getVEBoard(VEBoardVO vo) {
		System.out.println("VEBoardDAO.getVEBoard 角青");
		return (VEBoardVO)sqlSessionTemplate.selectOne("VEBoardDAO.getVEBoard", vo);
	}
	
	public List<VEBoardVO> getVEBoardList(Criteria cri) {
		System.out.println("VEBoardDAO.getVEBoardList 角青");
		return sqlSessionTemplate.selectList("VEBoardDAO.getVEBoardList", cri);
	}
	
	public int getVEBoardCount() {
		System.out.println("VEBoardDAO.getVEBoardCount 角青");
		return (int)sqlSessionTemplate.selectOne("VEBoardDAO.getVEBoardCount");
	}
	
}

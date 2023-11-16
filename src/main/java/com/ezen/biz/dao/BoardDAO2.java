package com.ezen.biz.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

@Repository
public class BoardDAO2 {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 글 작성
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 처리2");
		
		mybatis.insert("BoardMapper.insertBoard", vo);
	}
	
	// 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 처리2");
		
		mybatis.update("BoardMapper.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 처리2");
		
		mybatis.delete("BoardMapper.deleteboard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoard() 처리2");
		
		return mybatis.selectOne("BoardMapper.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardList() 처리2");
		
		return mybatis.selectList("BoardMapper.getBoardList_D", vo);
	}

}

















package com.ezen.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.common.Log4jAdvice;
import com.ezen.biz.common.LogAdvice;
import com.ezen.biz.dao.BoardDAO2;
import com.ezen.biz.dto.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO2 boardDao;
	// ����Ͻ� ��⿡�� �������� �α�ó�� ����
	//private LogAdvice log;
	//private Log4jAdvice log;
	
	public BoardServiceImpl() {
		// ����� �α� ��ü ����
		//log = new LogAdvice();
		//log = new Log4jAdvice();
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		//log.printLog();
		//log.printLogging();
		
		// ������ ���� �߻�
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
//		}
		boardDao.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		//log.printLog();
		//log.printLogging();
			
		boardDao.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		//log.printLog();
		//log.printLogging();
		
		boardDao.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		//log.printLog();
		//log.printLogging();
		
		return boardDao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLog();
		//log.printLogging();
		
		return boardDao.getBoardList(vo);
	}

}







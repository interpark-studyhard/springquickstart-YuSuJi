package com.springbook.biz.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.common.LogAdvice;
//import com.springbook.biz.common.Log4jAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAOSpring boardDAO;
	//private BoardDAO boardDAO;
	//private LogAdvice log;
	//private Log4jAdvice log;
	
	/*public BoardServiceIpml(){
		//log = new LogAdvice();
		log=new Log4jAdvice();
	}*/
	public void insertBoard(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		/*
		 if(vo.getSeq() == 0){
		 	throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�");
		  }
		*/
		
		//if(vo.getSeq() == 0){
		//	throw new IllegalArgumentException("0�� ���� ��� �� �� �����ϴ�.");
		//}
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);
	}

	//�� ����
	public void updateBoard(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}

	//�� ����
	public void deleteBorad(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		boardDAO.deleteBorad(vo);
	}

	//�� �� ��ȸ
	public BoardVO getBoard(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}

	//�� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}
	
}

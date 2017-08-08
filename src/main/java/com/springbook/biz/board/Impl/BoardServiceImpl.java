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
		 	throw new IllegalArgumentException("0번 글은 등록할 수 없습니다");
		  }
		*/
		
		//if(vo.getSeq() == 0){
		//	throw new IllegalArgumentException("0번 글은 등록 할 수 없습니다.");
		//}
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);
	}

	//글 수정
	public void updateBoard(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}

	//글 삭제
	public void deleteBorad(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		boardDAO.deleteBorad(vo);
	}

	//글 상세 조회
	public BoardVO getBoard(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}

	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		//log.printLog();
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}
	
}

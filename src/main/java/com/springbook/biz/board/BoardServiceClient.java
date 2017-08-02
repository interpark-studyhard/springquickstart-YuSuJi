package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String args[]){
		//1. spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring 컨테이너로부터 BoardServiceImpl 객체를 lookup 한다
	//	System.out.println("2번실행");
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. 글 등록 기능 테스트
//		System.out.println("3번실행");
		BoardVO vo = new BoardVO();
		vo.setTitle("3day");
		vo.setWriter("유수지");
		vo.setContent("스터디가 3일남았습니다.");
		boardService.insertBoard(vo);
		
		//4. 글 목록 검색 기능 테스트
//		System.out.println("4번실행");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList){
			System.out.println("-----> " + board.toString());
		}
		
		//5. spring 컨테이너 종료
		container.close();
	}
}

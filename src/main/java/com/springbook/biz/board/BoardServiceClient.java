package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String args[]){
		//1. spring �����̳� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring �����̳ʷκ��� BoardServiceImpl ��ü�� lookup �Ѵ�
	//	System.out.println("2������");
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. �� ��� ��� �׽�Ʈ
//		System.out.println("3������");
		BoardVO vo = new BoardVO();
		vo.setTitle("3day");
		vo.setWriter("������");
		vo.setContent("���͵� 3�ϳ��ҽ��ϴ�.");
		boardService.insertBoard(vo);
		
		//4. �� ��� �˻� ��� �׽�Ʈ
//		System.out.println("4������");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList){
			System.out.println("-----> " + board.toString());
		}
		
		//5. spring �����̳� ����
		container.close();
	}
}

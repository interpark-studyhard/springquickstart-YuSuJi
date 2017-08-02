package com.springbook.biz.board.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springbook.biz.board.BoardVO;

//DAO
@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//SQL ��ɾ��
	private final String BOARD_INSERT = "insert into board(seq,title,writer,content) values((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	
	//CRUD ��� �޼��� ����
	//�� ���	
	public void insertBoard(BoardVO vo){
		System.out.println("===> JDBC�� insertBoard() ��� ó��");
		//getJdbcTemplate().update(BOARD_INSERT,vo.getTitle(),vo.getWriter(), vo.getContent());
		jdbcTemplate.update(BOARD_INSERT,vo.getTitle(),vo.getWriter(), vo.getContent());
	}
	
	//�� ����
	public void updateBoard(BoardVO vo){
		System.out.println("===> JDBC�� updateBoard() ��� ó��");
		//getJdbcTemplate().update(BOARD_UPDATE,vo.getTitle(), vo.getContent(), vo.getSeq());
		jdbcTemplate.update(BOARD_UPDATE,vo.getTitle(), vo.getContent(), vo.getSeq());
	}
	
	//�� ����
	public void deleteBorad(BoardVO vo){
		System.out.println("===> JDBC�� deleteBoard() ��� ó��");
		//getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}
	
	//�� ����ȸ
	public BoardVO getBoard(BoardVO vo){
		System.out.println("===> JDBC�� getBoard() ��� ó��");
		Object[] args = {vo.getSeq()};
		//return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoradRowMapper());
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	//�� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC�� getBoardList() ��� ó��");		
		//return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
}



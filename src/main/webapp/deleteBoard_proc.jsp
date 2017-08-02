<%@ page import="com.springbook.biz.board.Impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page contentType="text/html; charset=EUC-KR"%>

<%

	//1.사용자 입력 정보 추출
	String seq = request.getParameter("seq");

	//2.DB 연동처리
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBorad(vo);
	
	//3.화면 네비게이션
	response.sendRedirect("getBoardList.jsp");

%>
<%@ page import="com.springbook.biz.board.Impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page contentType="text/html; charset=EUC-KR"%>

<%

	//1.����� �Է� ���� ����
	String seq = request.getParameter("seq");

	//2.DB ����ó��
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBorad(vo);
	
	//3.ȭ�� �׺���̼�
	response.sendRedirect("getBoardList.jsp");

%>
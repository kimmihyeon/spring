<%@page import="com.multicampus.biz.board.impl.BoardDAO"%>
<%@page import="com.multicampus.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. ����� �Է�����(seq, title, content) ����
	request.setCharacterEncoding("EUC-KR");
	int seq = Integer.parseInt(request.getParameter("seq"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	// 2. DB ����
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	vo.setTitle(title);
	vo.setContent(content);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	// 3. ���� ȭ�� �̵�
	response.sendRedirect("getBoardList.jsp");
%>
<%@page import="com.multicampus.biz.board.impl.BoardDAO"%>
<%@page import="com.multicampus.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. ����� �Է�����(seq) ����
	int seq = Integer.parseInt(request.getParameter("seq"));
	
	// 2. DB ����
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	// 3. ���� ȭ�� �̵�
	response.sendRedirect("getBoardList.jsp");
%>
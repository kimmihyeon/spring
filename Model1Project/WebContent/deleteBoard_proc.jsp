<%@page import="com.multicampus.biz.board.impl.BoardDAO"%>
<%@page import="com.multicampus.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. 사용자 입력정보(seq) 추출
	int seq = Integer.parseInt(request.getParameter("seq"));
	
	// 2. DB 연동
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	// 3. 응답 화면 이동
	response.sendRedirect("getBoardList.jsp");
%>
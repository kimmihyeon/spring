<%@page import="com.multicampus.biz.board.impl.BoardDAO"%>
<%@page import="com.multicampus.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. 사용자 입력정보(seq, title, content) 추출
	request.setCharacterEncoding("EUC-KR");
	int seq = Integer.parseInt(request.getParameter("seq"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	// 2. DB 연동
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	vo.setTitle(title);
	vo.setContent(content);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	// 3. 응답 화면 이동
	response.sendRedirect("getBoardList.jsp");
%>
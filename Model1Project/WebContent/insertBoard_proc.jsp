<%@page import="com.multicampus.biz.board.impl.BoardDAO"%>
<%@page import="com.multicampus.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. 사용자 입력정보(title, writer, content) 추출
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	// 2. DB 연동
	
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);

	BoardDAO boardDAO = new BoardDAO();
	boardDAO.insertBoard(vo);
	
	
	// 3. 응답 화면 이동(글 등록 이후에 목록화면으로 이동)
	response.sendRedirect("getBoardList.jsp");

%>
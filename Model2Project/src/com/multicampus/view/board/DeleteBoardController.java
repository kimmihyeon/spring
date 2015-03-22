package com.multicampus.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multicampus.biz.board.BoardVO;
import com.multicampus.biz.board.impl.BoardDAO;
import com.multicampus.view.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		// 1. ����� �Է�����(seq) ����
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		// 2. DB ����
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		// 3. ���� ȭ�� �̵�
		return "getBoardList.do";
	}

}

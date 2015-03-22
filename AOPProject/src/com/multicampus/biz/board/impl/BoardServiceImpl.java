package com.multicampus.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardVO;

@Component("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;	

//	public void setBoardDAO(BoardDAO boardDAO) {
//		this.boardDAO = boardDAO;
//	}

	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq() == 0){
//			throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
//		}
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

}

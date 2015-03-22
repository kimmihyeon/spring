package com.multicampus.biz.board;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		ApplicationContext container = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� BoardService Ÿ���� ��ü�� Lookup�Ѵ�.
		BoardService boardService = 
			(BoardService) container.getBean("boardService");
		
		// 3. �� ��� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("JDBC ����....");
		vo.setWriter("ȫ�浿");
		vo.setContent("JDBC ����...............");
		boardService.insertBoard(vo);
		
//		vo.setSeq(3);
//		BoardVO board = boardService.getBoard(vo);
//		
		
		// 4. �� ��� �˻� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}
}





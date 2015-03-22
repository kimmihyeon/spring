package com.multicampus.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.multicampus.biz.board.BoardVO;
import com.multicampus.biz.common.JDBCUtil;

// DAO(Data Access Object)
@Component
public class BoardDAOSpring {
	@Autowired  //�޸𸮿��� spring�� ã����..�ٵ� jdbctemplate�� �츮�� ����� �ƴ϶� annotaion�� ���� ����. bean����̶��ؾ���.
	private JdbcTemplate spring;
	
	// SQL ��ɾ��
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	// �� ���
	public void insertBoard(BoardVO vo){
		spring.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	}
	
	// �� ����
	public void updateBoard(BoardVO vo){
		spring.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}	
	
	// �� ����
	public void deleteBoard(BoardVO vo){
		spring.update(BOARD_DELETE, vo.getSeq());
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo){
		
		Object[] args = {vo.getSeq()}; //BOARD_GET�� �����ȿ� ����ǥ�� ������ ä����� �Ѵ�. 
		return spring.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		
		//�߻�Ŭ������ ��ü ������ �ȵ����� annoymous innerŬ���� ���·δ� ������ �����ϴ�.?
		return spring.query(BOARD_LIST, new BoardRowMapper());
	}	
}

class BoardRowMapper implements RowMapper<BoardVO>{
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		System.out.println("rownum : "+rowNum);
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}

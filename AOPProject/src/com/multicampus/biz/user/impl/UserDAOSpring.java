package com.multicampus.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.user.impl.UserRowMapper;
import com.multicampus.biz.common.JDBCUtil;
import com.multicampus.biz.user.UserVO;

// DAO(Data Access Object)
@Repository
public class UserDAOSpring {
	// DB 관련 변수
	@Autowired
	private JdbcTemplate spring;
	
	// SQL 명령어들
	private final String USER_GET = "select * from users where id=? and password=?";
	
	public UserVO getUser(UserVO vo){
		Object[] args = {vo.getId(), vo.getPassword()};
		return spring.queryForObject(USER_GET, args , new UserRowMapper());
	}
}


class UserRowMapper implements RowMapper<UserVO> {

	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("user rowNum"+rowNum);
		UserVO user = new UserVO();
		user.setId(rs.getString("ID"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setName(rs.getString("NAME"));
		user.setRole(rs.getString("ROLE"));
		return user;
	}
	
}

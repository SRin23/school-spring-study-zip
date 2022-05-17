package kr.hs.study.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.LoginBean;

@Component
public class MapperClass implements RowMapper<LoginBean>{

	public LoginBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginBean login = new LoginBean();
		login.setUserName(rs.getString("user_name"));
		login.setUserPassword(rs.getString("user_password"));
		return login;
	}
	
}

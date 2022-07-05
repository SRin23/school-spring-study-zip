package kr.hs.study.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class MapperClass implements RowMapper<TestBean>{
	//ResultSet에 있는 값을 DTO에 넘겨줌
	public TestBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		TestBean bean = new TestBean();
		bean.setData1(rs.getInt("data1"));
		bean.setData2(rs.getString("data2"));
		return bean;
	}
}

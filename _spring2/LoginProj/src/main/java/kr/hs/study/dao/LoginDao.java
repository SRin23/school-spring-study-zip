package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.LoginBean;
import kr.hs.study.mapper.MapperClass;

@Component
public class LoginDao {
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
	
	//INSERT
	public void insertData(LoginBean bean) {
		String sql = "insert into login (user_name, user_password) values (?, ?)";
		db.update(sql, bean.getUserName(), bean.getUserPassword());
	}
	
	//UPDATE
	public void updateData(String userName, LoginBean bean) {
		String sql = "update login set user_name=?, user_password=? where user_name=?";
		db.update(sql, bean.getUserName(), bean.getUserPassword(), userName);
	}
	
	//DELETE
	public void deleteData(String userName) {
		String sql = "delete from login where user_name=?";
		db.update(sql, userName);
	}
	
	//SELECT
	public List<LoginBean> selectData() {
		String sql = "select * from login";
		List<LoginBean> list = db.query(sql, mapper);
		return list;
	}
}

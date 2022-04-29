package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDao {

	//실제 쿼리를 날려줌
	//쿼리를 날리는 라이브러리 : Jdbc Template
	//여기에 Jdbc Template이 있어야한다.
	
	//JdbcTemplate 타입의 Bean을 찾아서 db에 저장
	@Autowired
	JdbcTemplate db;
	
	//insert
	public void insertData(TestBean bean) {
		String sql = "insert into test (data1, data2) values (?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	//update
	public void updateData(TestBean bean) {
		String sql = "update test set data1 = ? where data2 = ?";
		db.update(sql, bean.getData1(), bean.getData1());
	}
	
	//delete
	public void deleteData() {
		String sql = "delete from TEST";
		db.update(sql);
	}
}

package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;
import kr.hs.study.mapper.MapperClass;

@Component
public class TestDao {

	//실제 쿼리를 날려줌
	//쿼리를 날리는 라이브러리 : Jdbc Template
	//여기에 Jdbc Template이 있어야한다.
	
	//JdbcTemplate 타입의 Bean을 찾아서 db에 저장
	@Autowired
	JdbcTemplate db;

	@Autowired
	private MapperClass mapper;
	
	//insert
	public void insertData(TestBean bean) {
		String sql = "insert into test (data1, data2) values (?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	//update
	public void updateData(TestBean bean) {
		String sql = "update test set data2=? where data1=?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	//delete
	public void deleteData() {
		String sql = "delete from TEST";
		db.update(sql);
	}
	
	//select
	public List<TestBean> selectData() {
		String sql = "select * from test";
		List<TestBean> list = db.query(sql, mapper);	//sql query와 mapper를 함께 넘겨줌-> 반환형 List<>
		return list;
	}
}

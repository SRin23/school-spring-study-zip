package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session;
	
	public void insert(DataBean bean) {
		session.insert("test1.insert_data", bean);
	}

	public List<DataBean> select() {
		return session.selectList("test1.select_data");
	}
	
	public void delete(String data1) {
		session.delete("test1.delete_data", data1);
	}

}

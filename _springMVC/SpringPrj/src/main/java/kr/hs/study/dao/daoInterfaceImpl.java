package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.MyBatisSignupBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session;
	
	public void insert(MyBatisSignupBean bean) {
		session.insert("joinln.insert_data", bean);
	}

	public List<MyBatisSignupBean> select() {
		return session.selectList("joinln.select_data");
	}

}

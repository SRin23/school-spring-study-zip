package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.dto.MyBatisSignupBean;

@Service
public class dataInterfaceImpl implements dataInterface{

	@Autowired
	private daoInterface dao;
	
	public void insert(MyBatisSignupBean bean) {
		dao.insert(bean);
	}

	public List<MyBatisSignupBean> select() {
		return dao.select();
	}
}

package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.dto.DataBean;

@Service
public class dataInterfaceImpl implements dataInterface{

	@Autowired
	private daoInterface dao;
	
	public void insert(DataBean bean) {
		dao.insert(bean);
	}

	public List<DataBean> select() {
		return dao.select();
	}
	
	public void delete(String data1) {
		dao.delete(data1);
	}

}

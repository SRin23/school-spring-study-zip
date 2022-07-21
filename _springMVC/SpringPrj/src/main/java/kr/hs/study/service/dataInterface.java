package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.MyBatisSignupBean;
public interface dataInterface {
	//insert
	public void insert(MyBatisSignupBean bean);

	//select
	public List<MyBatisSignupBean> select();
}

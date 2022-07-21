package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.DataBean;

public interface dataInterface {
	//insert
	public void insert(DataBean bean);

	//select
	public List<DataBean> select();

	//delete
	public void delete(String data1);
}

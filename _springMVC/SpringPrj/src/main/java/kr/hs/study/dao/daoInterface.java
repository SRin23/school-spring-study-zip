package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.MyBatisSignupBean;

public interface daoInterface {
	public void insert(MyBatisSignupBean bean);
	public List<MyBatisSignupBean> select();
}

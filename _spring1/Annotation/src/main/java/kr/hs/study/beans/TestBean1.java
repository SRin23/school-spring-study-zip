package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	@Autowired	//Container에 DataBean1타입의 bean이 있으면 그걸 data1에 자동으로 대입
	@Qualifier("test")	//Container에 DataBean1타입의 이름이 "test"인 bean이 있으면 그걸 data1에 자동으로 대입 -> 만약, ConfigJavaClass에 test객체가 없으면 error
	private DataBean1 data1;
	
	@Autowired
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
}

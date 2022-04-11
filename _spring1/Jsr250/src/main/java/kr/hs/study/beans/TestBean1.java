package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
	
	@Resource	
	private DataBean1 data1;
	//이름이 data1(변수명)인 DataBean1타입의 Bean이 Container에 있으면 자동주입(Qualifier + AutoWired)
	
	@Resource
	private DataBean2 data2;
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("생성자 호출 이후 실행되는 'PostConstruct' 메서드입니다.");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Bean(객체) 소멸 직전 실행되는 'PreDestroy' 메서드입니다.");
	}
}

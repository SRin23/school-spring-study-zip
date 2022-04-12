package kr.hs.study.beans;

import org.springframework.stereotype.Component;

//객체 생성<bean>과 같음
@Component //이름을 정의하지 않음 -> 익명 객체가됨
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
}

package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy	//getBean시 객체 생성
@Scope("prototype")	//객체 생성마다 새로운 객체 생성 
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}
}

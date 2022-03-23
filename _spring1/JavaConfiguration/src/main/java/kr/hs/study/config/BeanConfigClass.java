package kr.hs.study.config;
//자바로 객체를 생성하는 설정파일

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

//이 자바파일이 (객체를 생성하는)설정 파일임을 나타내주는 어노테이션 
//Spring이 인식할 수 있게 도와줌
@Configuration
public class BeanConfigClass {
	//TestBean1의 객체 만들거야
	//config.xml : <bean id="t1" class="kr.hs.study.beans.TestBean1" />
	
	//아래 나오는 메서드를 실행해서 TestBean1객체를 만들거야
	@Bean
	public TestBean1 createTb1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 createTb2() {
		//위 createTb1의 객체와 이름이 같아도 괜찮다(container에는 메소드명으로 값이 저장되기 때문에)
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean 
	public TestBean1 createTb3() {
		//익명객체로 반환 가능하다.
		return new TestBean1();
	}
	
	//메소드명이 아닌 name의 값이 bean의 이름이 된다.
	//@Lazy는 config.xml에서 lazy-init과 같다.
	@Bean(name="test")
	@Lazy
	@Scope("prototype")	//객체 생성시 계속해서 새로운 객체 생성
	public TestBean2 java4() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
}

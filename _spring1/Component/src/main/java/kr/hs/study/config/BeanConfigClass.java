package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans", "kr.hs.study.beans2"})
public class BeanConfigClass {
	@Bean
	TestBean2 t3() {
		//Component를 이용해 만들 수 있는 객체는 1개 뿐이므로 만약, 같은 클래스로 2개 이상의 객체를 만들고 싶을땐, 직접 config에서 객체를 생성해주어야한다.
		return new TestBean2();
	}
	
	@Bean
	TestBean3 t4() {
		return new TestBean3();
	}
	
	@Bean
	TestBean3 t5() {
		return new TestBean3();
	}
	
	@Bean
	TestBean3 t6() {
		return new TestBean3();
	}
	
}

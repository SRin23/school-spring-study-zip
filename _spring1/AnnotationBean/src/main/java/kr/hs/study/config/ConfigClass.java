package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;

@Configuration
public class ConfigClass {
	
	@Bean(name="d1")
	public DataBean1 java1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 d2() {
		return new DataBean2();
	}
	
	//사용되지 않는다.
	@Bean
	public DataBean2 d3() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	
	
}

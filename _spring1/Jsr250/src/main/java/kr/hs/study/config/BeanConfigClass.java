package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean 
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean1 t1() {
		return new TestBean1();
	}
}

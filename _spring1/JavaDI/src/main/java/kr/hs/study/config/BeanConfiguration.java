package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfiguration {
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1(200, "spring2", new DataBean1());
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(400);
		t1.setData2("spring4");
		t1.setData3(new DataBean1());
		return t1;
	}
}

package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import kr.hs.study.beans.Person;

@ComponentScan(basePackages ="kr.hs.study.beans")
public class BeanConfigClass {
	@Bean
	public Person p2() {
		return new Person("lee", 15);
	}
}

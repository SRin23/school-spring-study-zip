package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean {
	@Autowired
	@Qualifier("p1")
	private Person p1;
	
	@Autowired
	@Qualifier("p2")
	private Person p2;
	
	public Person getP1() {
		return p1;
	}
	
	public Person getP2() {
		return p2;
	}
	
}

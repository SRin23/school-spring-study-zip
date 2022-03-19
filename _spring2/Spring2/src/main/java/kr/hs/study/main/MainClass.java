package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Person;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Person p1 =  ctx.getBean("p1", Person.class);
		Person p2 =  ctx.getBean("p2", Person.class);
	
		System.out.println(p1);
		System.out.println(p2);
		
		ctx.close();
	}

}

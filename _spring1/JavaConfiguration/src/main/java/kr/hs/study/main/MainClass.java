package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		//객체 생성을 설정할 BeanConfigClass와 container연결
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);	
		
		//Container에서 Bean을 불러올때, 객체명이 아닌, 메소드명으로 호출해야한다.
		TestBean1 obj1 = ctx.getBean("createTb1", TestBean1.class);
		System.out.println(obj1);
		
		TestBean1 obj2 = ctx.getBean("createTb2", TestBean1.class);
		System.out.println(obj2);
		
		TestBean1 obj3 = ctx.getBean("createTb3", TestBean1.class);
		System.out.println(obj3);
		
		TestBean2 obj4 = ctx.getBean("test", TestBean2.class);
		System.out.println(obj4);
		
		//같은 test객체를 호출해도 다른 주소가 뜬다.
		TestBean2 obj5 = ctx.getBean("test", TestBean2.class);
		System.out.println(obj5);
		
		ctx.close();
	}
	
}
 
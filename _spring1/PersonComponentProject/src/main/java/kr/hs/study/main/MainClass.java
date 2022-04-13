package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("<P1>name : " + obj1.getP1().getName());
		System.out.println("<P1>age : " + obj1.getP1().getAge());
		System.out.println("<P2>name : " + obj1.getP2().getName());
		System.out.println("<P2>age: " + obj1.getP2().getAge());
		
		
		ctx.close();
	}
}

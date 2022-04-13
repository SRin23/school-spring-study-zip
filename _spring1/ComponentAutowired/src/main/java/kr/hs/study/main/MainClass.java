package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("<XML>");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		System.out.println("data3 : " + obj1.getData3());
		System.out.println("data4 : " + obj1.getData4());
		ctx.close();
		
		System.out.println("-------------------");
		System.out.println("<Java>");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean obj2 = ctx2.getBean("t1", TestBean.class);
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		System.out.println("data3 : " + obj2.getData3());
		System.out.println("data4 : " + obj2.getData4());
		
		ctx2.close();
	}
}

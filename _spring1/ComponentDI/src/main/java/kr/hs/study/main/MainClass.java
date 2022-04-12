package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		System.out.println("<TestBean1 - XML>");
		TestBean1 obj2 = ctx1.getBean(TestBean1.class);
		System.out.println("data3 : " + obj2.getData3());
		System.out.println("data4 : " + obj2.getData4());
		
		ctx1.close();
		
		System.out.println("----------------------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		System.out.println("<TestBean1 - Java>");
		TestBean1 obj1 = ctx2.getBean(TestBean1.class);
		System.out.println("data3 : " + obj1.getData3());
		System.out.println("data4 : " + obj1.getData4());
		
		System.out.println();
		System.out.println("<TestBean2 - Java>");
		TestBean2 java2 = ctx2.getBean(TestBean2.class);
		System.out.println("data1 : " + java2.getData1());
		System.out.println("data2 : " + java2.getData2());
		System.out.println("data3 : " + java2.getData3());
		System.out.println("data4 : " + java2.getData4());
		
		ctx2.close();
	}
	
}
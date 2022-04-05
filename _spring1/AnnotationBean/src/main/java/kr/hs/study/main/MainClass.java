package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.ConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		System.out.println("XML");
		
		System.out.println("<TestBean1>");
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		
		System.out.println("\n<TestBean2>");
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		
		System.out.println("\n<TestBean3>");
		TestBean3 obj4 = ctx.getBean("t3", TestBean3.class);
		System.out.println("data1 : " + obj4.getData1());	//기본형의 값 주입은 Constructor arg를 통해 작성해야한다.
		System.out.println("data2 : " + obj4.getData2());
		System.out.println("data3 : " + obj4.getData3());
		System.out.println("data4 : " + obj4.getData4());
		ctx.close();
		
		System.out.println("==============================================");
		
		System.out.println("JAVA");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ConfigClass.class);
		System.out.println("<TestBean2>");
		TestBean2 obj3 = ctx2.getBean("java2", TestBean2.class);
		System.out.println("data1 : " + obj3.getData1());
		System.out.println("data1 : " + obj3.getData2());
		
		
		ctx2.close();
	}
}

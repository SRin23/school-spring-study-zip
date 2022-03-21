package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		obj1.printBean();
		
		
		System.out.println("-----------------------------");
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		System.out.println(obj2.getData3());
		System.out.println(obj2.getData4());
		
		ctx.close();	
	}
}

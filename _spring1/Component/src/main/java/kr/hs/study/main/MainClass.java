package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		//서로다른 Container(ClassPath, Annotation)에 각각 객체가 생성되므로 객체 주소가 다른것일뿐, 같은 Container에서 같은 객체 호출시, 같은 주소가 출력된다.
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = ctx1.getBean(TestBean1.class);
		System.out.println("obj1<TestBean1> : " + obj1);
		
		TestBean2 obj3 = ctx1.getBean("t1", TestBean2.class);
		System.out.println("obj3<TestBean2> : " + obj3);
		
		ctx1.close();
		
		System.out.println("---------------------------------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 obj2 = ctx2.getBean(TestBean1.class);
		System.out.println("obj2<TestBean1> : " + obj2);
		
		TestBean2 obj4 = ctx2.getBean("t1", TestBean2.class);
		System.out.println("obj4<TestBean2> : " + obj4);
		
		TestBean2 obj5 = ctx2.getBean("t3", TestBean2.class);
		System.out.println("obj5<TestBean2> : " + obj5);
		
		//@Lazy를 통해 getBean호출시, 객체 생성
		//@Scope("prototype")을 통해 getBean시 계속 새로운 객체 생성
		TestBean3 obj7 = ctx2.getBean("t4", TestBean3.class);
		System.out.println("obj7<TestBean3> : " + obj7);
		
		TestBean3 obj8 = ctx2.getBean("t5", TestBean3.class);
		System.out.println("obj8<TestBean3> : " + obj8);
		
		TestBean3 obj9 = ctx2.getBean("t6", TestBean3.class);
		System.out.println("obj9<TestBean3> : " + obj9);
		
		
		ctx2.close();
		
		
	}
}

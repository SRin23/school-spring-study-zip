package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;


public class MainClass {

	public static void main(String[] args) {
		/*t1객체를 가지고 와서 data1, data2, data3의 값을 출력*/
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		obj1.dataPrint();
		
		System.out.println("----------------------------");
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		obj2.dataPrint();
		
		System.out.println("----------------------------");
		
		//type속성이 없으면 obj2와 obj3 모두 double형 매개변수를 가지는 생성자로 처리됨
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		obj3.dataPrint();
		
		System.out.println("----------------------------");
		
		//type속성이 없으면 obj2와 obj3, obj4 모두 string형 매개변수를 가지는 생성자로 처리됨
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		obj4.dataPrint();
		
		System.out.println("----------------------------");
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		obj5.dataPrint();
		
		System.out.println("----------------------------");
		
		//매개변수가 참조변수일 경우(객체주입)
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.dataPrint();	//주소값이 출력된다.
		
		System.out.println("----------------------------");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		obj7.dataPrint();
		
		ctx.close();
	}

}

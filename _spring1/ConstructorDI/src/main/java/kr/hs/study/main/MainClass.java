package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;


public class MainClass {

	public static void main(String[] args) {
		/*t1��ü�� ������ �ͼ� data1, data2, data3�� ���� ���*/
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		obj1.dataPrint();
		
		System.out.println("----------------------------");
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		obj2.dataPrint();
		
		System.out.println("----------------------------");
		
		//type�Ӽ��� ������ obj2�� obj3 ��� double�� �Ű������� ������ �����ڷ� ó����
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		obj3.dataPrint();
		
		System.out.println("----------------------------");
		
		//type�Ӽ��� ������ obj2�� obj3, obj4 ��� string�� �Ű������� ������ �����ڷ� ó����
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		obj4.dataPrint();
		
		System.out.println("----------------------------");
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		obj5.dataPrint();
		
		System.out.println("----------------------------");
		
		//�Ű������� ���������� ���(��ü����)
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.dataPrint();	//�ּҰ��� ��µȴ�.
		
		System.out.println("----------------------------");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		obj7.dataPrint();
		
		ctx.close();
	}

}

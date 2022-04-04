package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		//Java로 객체 생성을 설정할때는 AnnotationConfigApplicationContext을 사용한다.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 obj1 = ctx.getBean("abc", TestBean1.class);
		System.out.println(obj1);
		
		TestBean1 obj2 = ctx.getBean("abc", TestBean1.class);
		System.out.println(obj2);
		ctx.close();
	}

}

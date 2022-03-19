package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {
	public static void main(String[] args) {
		//사용할 container 정의
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//en, ko 객체 가져오기
		HelloWorld en = ctx.getBean("en", HelloWorldEn.class);
		HelloWorld ko = ctx.getBean("ko", HelloWorldKo.class);
		
		//container 종료
		ctx.close();
		
		//en, ko 메서드 호출
		en.sayHello();
		ko.sayHello();		
	}
}

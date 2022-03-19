package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {
	public static void main(String[] args) {
		//����� container ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//en, ko ��ü ��������
		HelloWorld en = ctx.getBean("en", HelloWorldEn.class);
		HelloWorld ko = ctx.getBean("ko", HelloWorldKo.class);
		
		//container ����
		ctx.close();
		
		//en, ko �޼��� ȣ��
		en.sayHello();
		ko.sayHello();		
	}
}

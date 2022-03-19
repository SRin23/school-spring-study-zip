package kr.hs.study.main;

import kr.hs.study.Hello;
import kr.hs.study.HelloWorldEn;
import kr.hs.study.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		Hello hello = new HelloWorldEn();	//부모의 참조변수로 자식을 가리킴 -> 다형성의 특징
		Hello hello2 = new HelloWorldKo();	//인터페이스를 사용하는것 : 느슨한 결합
		//HelloWorldKo hello2 = new HelloWorldKo();	//이건 타이트한 결합(앞뒤 클래스가 같아야함)
		say_Method(hello);	// static을 사용한 클래스 변수이므로 객체 생성 없이 바로 실행가능
		say_Method(hello2);	
	}
	
	public static void say_Method(Hello hello) {
		hello.sayHello();
	}
}

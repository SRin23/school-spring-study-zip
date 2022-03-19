package kr.hs.study.main;

import kr.hs.study.Hello;
import kr.hs.study.HelloWorldEn;
import kr.hs.study.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		Hello hello = new HelloWorldEn();	//�θ��� ���������� �ڽ��� ����Ŵ -> �������� Ư¡
		Hello hello2 = new HelloWorldKo();	//�������̽��� ����ϴ°� : ������ ����
		//HelloWorldKo hello2 = new HelloWorldKo();	//�̰� Ÿ��Ʈ�� ����(�յ� Ŭ������ ���ƾ���)
		say_Method(hello);	// static�� ����� Ŭ���� �����̹Ƿ� ��ü ���� ���� �ٷ� ���డ��
		say_Method(hello2);	
	}
	
	public static void say_Method(Hello hello) {
		hello.sayHello();
	}
}

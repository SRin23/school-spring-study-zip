package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		//xml 파일 로딩시, 객체 생성
		//객체를 호출하지 않아도 config에 있는 객체의 기본생성자가 호출됨
		//Spring의 객체는 xml파일 로딩시 자동으로 생성된다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml"); 이 컨테이너도 많이 사용한다!!
		
		//이때 출력시, t1객체의 기본생성자만 출력이된다.(t1생성자는 xml 파일이 로딩될때 객체가 생성되기 때문) lazy-init
		
		//값 저장
//		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
//		TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
//		TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
//		TestBean1 obj4 = ctx.getBean("t2", TestBean1.class);
		TestBean1 obj5 = ctx.getBean("t3", TestBean1.class);	//생성자 2개 호출 후, init기본생성자 실행(lazy때문에)
		
		//값 출력(두 객체의 주소가 같음을 알 수 있다.)
//		System.out.println("obj1 : " + obj1);
//		System.out.println("obj2 : " + obj2);
		
		//위 객체의 주소와는 다름을 알 수 있다.
		//scope = "prototype"로 인해 같은 객체를 가리키는 obj3과 obj4가 다른 주소값을 찍는다는 것을 알 수 있다.
		//위의 scope사용시, lazy-init = "true"가 전제조건이 되어야 한다 -> 전제조건을 만족하지 못할 경우, xml로딩시 모든 객체를 생성해버려, 이미 만들어진 객체를 가져와 사용할 테니
//		System.out.println("obj3 : " + obj3);
//		System.out.println("obj4 : " + obj4);
		
		
		System.out.println("obj5 : " + obj5);
		
		//ctx 헤제 -> bean소멸 -> container에서 bean들이 없어진다.
		ctx.close();
		//ctx.close전, destroy-method 실행
	}

}
//한번 객체를 생성하면 계속해서 쓰는 방식을 싱글톤이라고 하며, Spring은 기본적으로 싱글톤 방식의 언어이다.
//스프링은 기본적으로 singleton이다. 한번생성되면 계속 사용한다.

//사용하지 않는 객체도 xml에 정의하면 생성된다 -> 이는 메모리 낭비 -> config에서 lazy-init = "true"로 변경하여 메모리 낭비 최소
//lazy-init = "true"로 변경시 xml파일 로딩시 생성되던 객체가 사용자가 객체를 사용할때(getBean메서드 호출시) 객체를 생성하게 되어 메모리 낭비가 줄어든다.

//1. 
//2. lazy-init = "true" : 
//3. scope = "prototype" : 
//4. ctx.close()
//5. init-method() : 생성자 이후 자동으로 실행되는 메서드를 설정하는 옵션
//6. destroy-method() : 객체 소멸 이전에 자동으로 실행되는 메서드(ctx.close() 바로 전에 실행되는 메서드를 말한다.)
package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	//기본형에는 @Autowired사용이 불가하다.
	//private int data;
	
	//container에 DataBean1타입의 bean이 있으면, 그 값을 알아서 data1에 자동주입해라
	//@Qualifier동일한 type의 Bena객체가 여러개이면 작성해주어야한다.
	//@qualifier("d1") DataBean1타입의 객체 중 id가 d1인 객체와 자동주입한다는 의미이다.
	@Autowired
	@Qualifier("d1")	//이름이 d1인 bean을 찾아서 data1에 자동주입해라
	private DataBean1 data1;
		
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2;
	
	//Getter
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
}

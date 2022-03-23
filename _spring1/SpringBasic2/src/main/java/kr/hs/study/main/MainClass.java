package kr.hs.study.main;
//Test commit
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		//우리가 사용할 Container(ClassPathXmlApplicationContext) -> 이외에도 다양한 container가 있으며, 
		//사용 용도에 맞게 변경가능하다.(ex. GenericXmlApplicationContext)
		
		//config.xml파일을 읽은 후 메모리로 로딩하여 객체(bean)를 생성한 후 container에 전송후 보관(주소값보관)한다.(여기까지)
		//ClassPathXmlApplicationContext은 xml파일을 로딩시키는 용도의 Container이다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//container에 있는 t1 Bean(객체)를 가지고와서 t1에 넣음
		TestBean t1 = (TestBean) ctx.getBean("t1");			//방법1) getBean은 Object 타입이므로 TestBean타입으로 DownCasting 해줌
		TestBean t2 = ctx.getBean("t2", TestBean.class);	//방법2) DownCasting하지 않고 클래스 타입 직접 지정
		TestBean t3 = ctx.getBean("t2", TestBean.class);	//t2와 같은 주소를 가짐, 싱글톤(객체는 한번 생성되면, 계속 그 객체를 가져와 사용할 수 있다.)
		
		//주소값
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);	//t2와 같은 주소를 출력함(같은 객체 참조)
		
		
		//container 종료 -> container에서 bean 삭제
		ctx.close();
	}
}

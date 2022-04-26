package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDao;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//TestDao 가져오기
		TestDao dao = ctx.getBean(TestDao.class);
		
		//TestBean객체 bean1 만들어서 100, spring100 넣기
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		obj1.setData2("spring100");
		
		//TestBean 객체 bean2 만들어서 200, spring200 넣기
		TestBean obj2 = new TestBean();
		obj2.setData1(200);
		obj2.setData2("spring200");
		
		//inertData호출
		dao.insertData(obj1);
		dao.insertData(obj2);
		
		ctx.close();
	}
}

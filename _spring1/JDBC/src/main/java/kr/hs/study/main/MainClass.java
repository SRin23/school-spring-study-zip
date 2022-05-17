package kr.hs.study.main;

import java.util.List;

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
//		System.out.println("--insert--");
//		TestBean obj1 = new TestBean(); 
//		obj1.setData1(300);
//		obj1.setData2("spring300");
//		dao.insertData(obj1);
		
		//TestBean 객체 bean2 만들어서 200, spring200 넣기	
//		System.out.println("--insert--");
//		TestBean obj2 = new TestBean(); 
//		obj2.setData1(400);
//		obj2.setData2("spring400");
//		dao.insertData(obj2);
		 

		//update
//		System.out.println("--update--");
//		TestBean obj3 = new TestBean(); 
//		obj3.setData1(300);
//		obj3.setData2("spring450");  
//		dao.updateData(obj3);
		
//		System.out.println("delete");
//		dao.deleteData();
		
		
		//select
		System.out.println("--select--");
		List<TestBean> list = dao.selectData();
		for(TestBean bean:list) {
			System.out.print("Data1 : " + bean.getData1() + ", ");
			System.out.println("Data2 : " + bean.getData2());
		}
		
		ctx.close();
	}
}

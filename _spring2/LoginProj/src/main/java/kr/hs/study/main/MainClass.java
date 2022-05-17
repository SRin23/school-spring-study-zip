package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.LoginBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.LoginDao;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		LoginDao dao = ctx.getBean(LoginDao.class);
		
//		//insert
//		System.out.println("insert1");
//		LoginBean i1 = new LoginBean();
//		i1.setUserName("Kim");
//		i1.setUserPassword("1111");
//		dao.insertData(i1);
//		
//		//insert
//		System.out.println("insert2");
//		LoginBean i2 = new LoginBean();
//		i2.setUserName("Lee");
//		i2.setUserPassword("2222");	
//		dao.insertData(i2);
//		
//		//insert
//		System.out.println("insert3");
//		LoginBean i3 = new LoginBean();
//		i3.setUserName("Bark");
//		i3.setUserPassword("4444");	
//		dao.insertData(i3);
//
//		//insert
//		System.out.println("insert4");
//		LoginBean i4 = new LoginBean();
//		i4.setUserName("Hong");
//		i4.setUserPassword("5555");	
//		dao.insertData(i4);
//		
//		//update
//		System.out.println("update1");
//		LoginBean u1 = new LoginBean();
//		u1.setUserName("Park");
//		u1.setUserPassword("3333");
//		dao.updateData("Bark", u1);
//		
//		//delete
//		System.out.println("delete1");
//		dao.deleteData("Hong");
		
		//select
		System.out.println("select1");
		List<LoginBean> list = dao.selectData();
		for(LoginBean bean : list) {
			System.out.println("[" + bean.getUserName() + ", " + bean.getUserPassword() + "]");
		}
		
		ctx.close();
	}
}

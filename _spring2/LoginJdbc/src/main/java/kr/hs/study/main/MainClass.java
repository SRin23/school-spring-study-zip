package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.UserInfoDao;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//1. UserInfoDao 가져오기
		UserInfoDao userDao = ctx.getBean(UserInfoDao.class);
		
		//2. UserInfo 객체 만들기
//		UserInfo user1 = new UserInfo();
//		user1.setUserId("1");
//		user1.setUserPass("abc123");
//		user1.setUserName("Mirim");
//		user1.setUserAge(13);
//		
//		UserInfo user2 = new UserInfo();
//		user2.setUserId("2");
//		user2.setUserPass("zyx321");
//		user2.setUserName("Kim");
//		user2.setUserAge(28);
//		
//		System.out.println("----------INSERT");
//		userDao.insertQuery(user1);
//		userDao.insertQuery(user2);
		
//		System.out.println("----------UPDATE");
//		userDao.updateQuery("1", "SE");
		
		System.out.println("----------DELETE");
		userDao.deleteQuery();
		
		System.out.println("CLOSE");
		ctx.close();
	}
}

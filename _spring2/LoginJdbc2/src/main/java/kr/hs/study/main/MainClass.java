package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Member;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.MemberDao;

public class MainClass {
	static MemberDao memberDao;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		memberDao = ctx.getBean(MemberDao.class);
		updateMember();
		
		System.out.println("ÇØ°á");
		ctx.close();
	}
	
	private static void updateMember() {
		System.out.println("--------update member");
		Member mem = new Member();
		mem.setName("Kim");
		mem.setPassword("1111");
		mem.setEmail("a@gmail.com");
		memberDao.update(mem);
	}
}

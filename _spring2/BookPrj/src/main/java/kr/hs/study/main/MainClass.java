package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Book novel = ctx.getBean("novel", Novel.class);
		novel.buy();
		
		Book poet = ctx.getBean("poet", Poet.class);
		poet.buy();
		
		Book magazine = ctx.getBean("magazine", Magazine.class);
		magazine.buy();
		
		ctx.close();
	}
}

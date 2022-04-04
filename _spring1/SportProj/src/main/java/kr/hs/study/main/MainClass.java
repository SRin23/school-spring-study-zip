package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.Sports;
import kr.hs.study.beans.Vollyball;
import kr.hs.study.config.JavaConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Sports baseball = ctx.getBean("baseball", Baseball.class);
		baseball.play();
		baseball.stop();
		
		Sports basketball = ctx.getBean("basketball", Basketball.class);
		basketball.play();
		basketball.stop();
		
		Sports vollyball = ctx.getBean("vollyball", Vollyball.class);
		vollyball.play();
		vollyball.stop();
		
		ctx.close();
	}
}

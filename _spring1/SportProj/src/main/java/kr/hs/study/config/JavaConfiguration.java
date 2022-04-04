package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.Vollyball;

@Configuration
public class JavaConfiguration {

	@Bean
	public Baseball baseball() {
		Baseball b1 = new Baseball("9명", "9회");
		return b1;
	}
	
	@Bean
	public Basketball basketball() {
		Basketball b2 = new Basketball();
		b2.setPlayer("6명");
		b2.setSet(3);
		return b2;
	}
	
	@Bean
	public Vollyball vollyball() {
		Vollyball b3 = new Vollyball("5명", 4);
		return b3;
	}
}

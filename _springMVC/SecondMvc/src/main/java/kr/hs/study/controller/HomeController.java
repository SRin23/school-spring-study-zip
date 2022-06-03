package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		System.out.println("Hello spring! 확인");
		return "home";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {		
		System.out.println("1~10까지의 합 출력 확인");
		return "add";
	}
}

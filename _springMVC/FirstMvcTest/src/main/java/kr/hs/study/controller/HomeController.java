package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//GET 방식으로 "/"에 접속했을때 아래 메서드를 실행해라
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		System.out.println("test");
		return "test";
	}
}

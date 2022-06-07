package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub1")
public class TestController {
	@GetMapping("/test3")
	public String test3() {
		System.out.println("test3 �������� �̵��մϴ�.");
		return "test3";
	}
	
	@GetMapping("/test4")
	public String test4() {
		System.out.println("test4 �������� �̵��մϴ�.");
		return "test4";
	}
}



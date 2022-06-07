package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String test() {
		System.out.println("test �������� �̵��մϴ�.");
		return "test";
	}
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("test1 �������� �̵��մϴ�.");
		return "test1";
	}
}

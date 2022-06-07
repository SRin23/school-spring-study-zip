package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String test() {
		System.out.println("test 페이지로 이동합니다.");
		return "test";
	}
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("test1 페이지로 이동합니다.");
		return "test1";
	}
}

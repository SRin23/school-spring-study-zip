package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub2")	//공통된 부분을 빼줌
public class Test2Controller {
	@GetMapping("/test5")
	public String test5() {
		System.out.println("test5 페이지로 이동합니다.");
		return "test5";
	}
	
	@GetMapping("/test6")
	public String test6() {
		System.out.println("test6 페이지로 이동합니다.");
		return "test6";
	}
	
	@GetMapping("/test7")
	public String test7() {
		System.out.println("test7 페이지로 이동합니다.");
		return "test7";
	}
}

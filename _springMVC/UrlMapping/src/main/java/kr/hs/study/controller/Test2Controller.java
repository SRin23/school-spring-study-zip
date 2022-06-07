package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub2")	//����� �κ��� ����
public class Test2Controller {
	@GetMapping("/test5")
	public String test5() {
		System.out.println("test5 �������� �̵��մϴ�.");
		return "test5";
	}
	
	@GetMapping("/test6")
	public String test6() {
		System.out.println("test6 �������� �̵��մϴ�.");
		return "test6";
	}
	
	@GetMapping("/test7")
	public String test7() {
		System.out.println("test7 �������� �̵��մϴ�.");
		return "test7";
	}
}

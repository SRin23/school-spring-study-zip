package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		//주소 변경
		return "redirect:/result1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		//주소 미변경
		return "forward:/result2";
	}
	
	@GetMapping("/result1")
	public String result1() {
		return "result1";
	}
	
	@GetMapping("/result2")
	public String result2() {
		return "result2";
	}
}

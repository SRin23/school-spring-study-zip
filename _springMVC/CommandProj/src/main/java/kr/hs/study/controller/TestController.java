package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.DataBean;

@Controller
public class TestController {
	/*
	@PostMapping("/test1") 
	public String test1(@ModelAttribute DataBean bean, Model model) { //ModelAttribute는 자동주입되는것(생략가능) 
		model.addAttribute("bean",bean); 
		return "result_test1"; 
	}
	*/

	// request영역에 객체 이름을 지정해서 저장하는 방법 -> 반드시 @ModelAttribute를 작성해야한다.
	@PostMapping("/test1")
	public String test1(@ModelAttribute("testBean") DataBean bean, Model model) {
		model.addAttribute("bean", bean);
		return "result_test1";
	}
}

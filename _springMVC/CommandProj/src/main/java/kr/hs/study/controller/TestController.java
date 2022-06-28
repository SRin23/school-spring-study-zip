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
	public String test1(@ModelAttribute DataBean bean, Model model) { //ModelAttribute�� �ڵ����ԵǴ°�(��������) 
		model.addAttribute("bean",bean); 
		return "result_test1"; 
	}
	*/

	// request������ ��ü �̸��� �����ؼ� �����ϴ� ��� -> �ݵ�� @ModelAttribute�� �ۼ��ؾ��Ѵ�.
	@PostMapping("/test1")
	public String test1(@ModelAttribute("testBean") DataBean bean, Model model) {
		model.addAttribute("bean", bean);
		return "result_test1";
	}
}

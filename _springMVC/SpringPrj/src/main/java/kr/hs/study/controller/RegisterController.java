package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.MyBatisSignupBean;
import kr.hs.study.service.dataInterface;

@Controller
public class RegisterController {
	@Autowired
	private dataInterface dataService;
	
	@GetMapping("/register")
	public String registerGet() {
		return "register/register_form";
	}
	
	@PostMapping("/register_post")
	public String registerPost(@ModelAttribute MyBatisSignupBean bean) {
		dataService.insert(bean);
		return "regitster_input_result";
	}
	
	@GetMapping("/register_list")
	public String read_data(Model model) {
		List<MyBatisSignupBean> list = dataService.select();
		model.addAttribute("list", list);
		System.out.println("list size : " + list.size());
		return "register/register_list";
	}
}

package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.beans.SignupBean;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String signup() {
		return "signup/signup_form";
	}
	
	@PostMapping("/signup_check")
	public String signupCheck(@ModelAttribute("userInfo") SignupBean bean, Model model) {
		if(!bean.getId().equals(null)&&!bean.getPw().equals(null)) {
			model.addAttribute("signupInfo", bean);
			return "signup/signup_result";
		}else {
			return "redirect:signup/signup_form";
		}
	}
}

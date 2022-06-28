package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.beans.LoginBean;

@Controller
public class LoginController {
	//·Î±×ÀÎ
	
		@GetMapping("/login")
		public String login(){
			return "login/login";
		}
		
		@PostMapping("/login_check")
		public String loginCheck(@ModelAttribute LoginBean bean, Model model) {
			if(bean.getId().equals("kim") && bean.getPw().equals("1111")) {
				model.addAttribute("loginbean", bean);
				return "login/login_result";
			}else {
				return "redirect:/login";
			}
		}
}

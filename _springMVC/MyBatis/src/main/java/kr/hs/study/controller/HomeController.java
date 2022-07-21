package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "index";
	}

}

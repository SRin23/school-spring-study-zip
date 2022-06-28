package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiplicationController {
	//备备窜
	@GetMapping("/multipli")
	public String multipli() {
		return "multi";
	}
	
	/*
	@PostMapping("/multipli_result")
	public String multipliResult(@RequestParam int data) {
		System.out.println("------备备窜------");
		for(int i = 1; i<10; i++) {
			System.out.println(data + " * " + i + " = " + (data*i));
		}
		return "result";
	}
	*/
	
	//Model
	/*
	@PostMapping("/multipli_result")
	public String multipliResult(Model model, int data) {
		String[] multi = new String[9];
		for(int i = 0; i<9; i++) {
			multi[i] = data + " * " + i + " = " + (data*i);
			model.addAttribute("value" + (i+1), multi[i]);
		}
		
		return "multipli_success";
	}
	*/
	
	//ModelAndView
	@PostMapping("/multipli_result")
	public ModelAndView multipliResult(ModelAndView mv, int data) {
		mv.setViewName("multipli_success");
		String[] multi = new String[9];
		for(int i = 0; i<9; i++) {
			multi[i] = data + " * " + i + " = " + (data*i);
			mv.addObject("value" + (i+1), multi[i]);
		}
		
		return mv;
	}
	
}

package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.beans.ScoreBean;

@Controller
public class DataController {

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
	
	
	//----------------------------------------------------
	//己利
	@GetMapping("/score")
	public String score() {
		return "score";
	}
	
	/*
	@PostMapping("/score_result")
	public String scoreResult(ScoreBean score) {
		System.out.println("------己利备窍扁------");
		System.out.println("name : " + score.getName());
		System.out.println("korean : " + score.getKorean());
		System.out.println("english : " + score.getEnglish());
		System.out.println("math : " + score.getMath());
		System.out.println("spring : " + score.getSpring());
		System.out.println("醚钦 : " + score.printTotal());
		System.out.println("乞闭 : " + score.printAvg());
		
		return "result";
	}
	*/
	
	
	//Model
	/*
	@PostMapping("/score_result")
	public String scoreResult(Model model, ScoreBean score) {
		
		model.addAttribute("name", score.getName());
		model.addAttribute("korean", score.getKorean());
		model.addAttribute("english", score.getEnglish());
		model.addAttribute("math", score.getMath());
		model.addAttribute("spring", score.getSpring());
		model.addAttribute("total", score.printTotal());
		model.addAttribute("avg", score.printAvg());
		
		return "score_success";
	}
	*/
	
	//ModelAndView
	@PostMapping("/score_result")
	public ModelAndView scoreResult(ModelAndView mv, ScoreBean score) {
		mv.setViewName("score_success");
		mv.addObject("name", score.getName());
		mv.addObject("korean", score.getKorean());
		mv.addObject("english", score.getEnglish());
		mv.addObject("math", score.getMath());
		mv.addObject("spring", score.getSpring());
		mv.addObject("total", score.printTotal());
		mv.addObject("avg", score.printAvg());
		
		return mv;
	}
}

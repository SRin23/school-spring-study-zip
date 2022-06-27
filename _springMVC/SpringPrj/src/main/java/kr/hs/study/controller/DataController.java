package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.ScoreBean;

@Controller
public class DataController {

	@GetMapping("/multipli")
	public String multipli() {
		return "multi";
	}
	
	@PostMapping("/multipli_result")
	public String multipliResult(@RequestParam int data) {
		System.out.println("------������------");
		for(int i = 1; i<10; i++) {
			System.out.println(data + " * " + i + " = " + (data*i));
		}
		return "result";
	}
	
	@GetMapping("/score")
	public String score() {
		return "score";
	}
	
	@PostMapping("/score_result")
	public String scoreResult(ScoreBean score) {
		System.out.println("------�������ϱ�------");
		System.out.println("name : " + score.getName());
		System.out.println("korean : " + score.getKorean());
		System.out.println("english : " + score.getEnglish());
		System.out.println("math : " + score.getMath());
		System.out.println("spring : " + score.getSpring());
		System.out.println("���� : " + score.printTotal());
		System.out.println("��� : " + score.printAvg());
		
		return "result";
	}
	
}

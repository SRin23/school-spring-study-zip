package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {

	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		System.out.println("--------result1 ȣ��--------");
		
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String[] c = request.getParameterValues("c");

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.print("c : ");

		for(String item : c) {
			System.out.print(item + " ");
		}
		
		return "result1";
	}

	//PathVariable�� �� ��ȯ�� �����ϴ�.
	@GetMapping("/result2/{a}/{b}/{c}")
	public String result2(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		System.out.println("--------result1 ȣ��--------");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

		return "result2";
	}
	
}

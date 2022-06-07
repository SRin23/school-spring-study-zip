package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		System.out.println("------- test1 페이지가 호출되었습니다. -------");
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		System.out.println("------- test2 페이지가 호출되었습니다. -------");
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		/*
		 * for(int i = 0; i<data3.length; i++) { 
		 * 		System.out.println("data3[" + i + "] : " + data3[i]); 
		 * }
		 */
		
		System.out.print("data3 : ");
		for(String str : data3) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest webRequest) {
		System.out.println("------- test3 페이지가 호출되었습니다. -------");
		String data1 = webRequest.getParameter("data1");
		String data2 = webRequest.getParameter("data2");
		String data3 = webRequest.getParameter("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "result";
	}
	
	//URL에 변수명 지정
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable String data1, 
						@PathVariable String data2, 
						@PathVariable String data3) {
		System.out.println("------- test4 페이지가 호출되었습니다. -------");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		return "result";
	}
}
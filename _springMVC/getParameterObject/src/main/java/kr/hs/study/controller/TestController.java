package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;

@Controller	//@Component도 가능
public class TestController {
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.print("data3 : ");
		for(String str : data3) {
			System.out.print(str + " ");
		}
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute DataBean bean) {
		//bean 객체에 요청된 값을 자동주입해라
		//@ModelAttribute를 생략가능하다(많이 사용하기 때문에)
		System.out.println("data1 : " + bean.getData1());
		System.out.println("data2 : " + bean.getData2());
		System.out.println("data3 : " + bean.getData3());
		
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(DataBean2 bean, DataBean3 bean3) {
		System.out.println("---------bean2---------");
		System.out.println("data1 : " + bean.getData1());
		System.out.println("data2 : " + bean.getData2());
		System.out.print("data3 : ");
		for(int item : bean.getData3()) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		System.out.println("---------bean3---------");
		System.out.println("data1 : " + bean3.getData1());
		System.out.println("data2 : " + bean3.getData2());
		return "result";
	}
	
	
}

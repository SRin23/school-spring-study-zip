package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class TestController {

	@Autowired
	private dataInterface dataService;
	
	@GetMapping("/input_data")
	public String inputData() {
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@ModelAttribute DataBean bean) {
		dataService.insert(bean);
		return "result";
	}
	
	@GetMapping("/read_data")
	public String read_data(Model model) {
		List<DataBean> list = dataService.select();
		model.addAttribute("list", list);
		System.out.println("dataSize : " + list.size());
		return "result2";
	}
	
	@GetMapping("/delete_data")
	public String delete_data(@RequestParam(value="data1") String data1) {
		dataService.delete(data1);
		return "result3";
	}
}

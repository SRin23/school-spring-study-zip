package kr.hs.study.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath;
	
	@GetMapping("/upload")
	public String upload_form() {
		return "upload/upload_form";
	}
	
	@PostMapping("/upload")
	public ModelAndView re_upload(@RequestParam("file") MultipartFile file, ModelAndView mv) throws Exception{
		//file�� ���ε��ϴ� ���Ͽ� ���� ��� ������ ������ ����
		String savedName = file.getOriginalFilename();
		File a = new File(uploadPath, savedName);
		
		//�̻��� ������ �̻��� �̸��� ������ �츮�� ������ ���ε� ������ �������� �̸����� �̵�
		FileCopyUtils.copy(file.getBytes(), a);
		mv.setViewName("upload/result");
		mv.addObject("savedName", savedName);
		
		return mv;
	}
}

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
		//file은 업로드하는 파일에 대한 모든 정보를 가지고 있음
		String savedName = file.getOriginalFilename();
		File a = new File(uploadPath, savedName);
		
		//이상한 폴더의 이상한 이름의 파일을 우리가 지정한 업로드 폴더에 정상적인 이름으로 이동
		FileCopyUtils.copy(file.getBytes(), a);
		mv.setViewName("upload/result");
		mv.addObject("savedName", savedName);
		
		return mv;
	}
}

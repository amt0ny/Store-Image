package com.set.img.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.set.img.service.IImgService;

@RestController
public class ImgController {
	
	@Autowired
	private IImgService imgService;
	
	@PostMapping("/addData")
	public String addData() throws IOException {
		return imgService.insertData();
	}
	
	@GetMapping("/getImages")
	private String getImgbyId() {
		return imgService.getImage();
	}

}
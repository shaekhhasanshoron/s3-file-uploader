package com.grokonez.s3.controller;

import com.grokonez.s3.dto.FileTestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.grokonez.s3.services.S3Services;
 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UploadFileController {
	
	@Autowired
	S3Services s3Services;
	
    @PostMapping("/api/file/upload")
    public String uploadMultipartFile(@RequestParam("file") MultipartFile file) {
    	String keyName = file.getOriginalFilename();
//		s3Services.uploadFile(keyName, file);
		return "Upload Successfully -> KeyName = " + keyName;
    }

//	@PostMapping("/api/file/upload")
//	public String uploadMultipartFile2(@RequestBody FileTestDTO dto) {
//		String keyName = dto.getFile().getName();
////		s3Services.uploadFile(keyName, file);
//		return "Upload Successfully -> KeyName = " + keyName;
//	}
}
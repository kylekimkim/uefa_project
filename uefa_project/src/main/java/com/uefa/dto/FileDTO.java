package com.uefa.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileDTO {
	private String img_name;
	private MultipartFile uploadfile;

	
	public String getImg_name() {
		return img_name;
	}

	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}

	public MultipartFile getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	
	
}

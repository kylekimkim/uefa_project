package com.uefa.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.uefa.dto.FileDTO;
import com.uefa.repository.NewsRepository;
import com.uefa.vo.NewsVo;

@Controller
@RequestMapping("/news")
public class NewsController {

	 @Autowired
	 NewsRepository nr;
	   
	   @GetMapping("/list/{page}")
		public String list(@PathVariable int page,
							@RequestParam(defaultValue = "postTime") String sort,
							@RequestParam(defaultValue = "desc") String desc ,
							Model model) {
		   	int size=10;
			Pageable pageable=null;
			if(desc.equals("desc")) {
				pageable=PageRequest.of(page-1,  size, Sort.by(sort).descending());
			}else if(desc.equals("asc")) {
				pageable=PageRequest.of(page-1, size, Sort.by(sort).ascending());
			}
			
			Page<NewsVo> newsList=nr.findAll(pageable);
			model.addAttribute("newsList", newsList);
			return "/news/list";
		}
	   @GetMapping("/list2/{page}")
		public String list2(@PathVariable int page,
							@RequestParam(defaultValue = "view") String sort,
							@RequestParam(defaultValue = "desc") String desc ,
							Model model) {
		   	int size=10;
			Pageable pageable=null;
			if(desc.equals("desc")) {
				pageable=PageRequest.of(page-1,  size, Sort.by(sort).descending());
			}else if(desc.equals("asc")) {
				pageable=PageRequest.of(page-1, size, Sort.by(sort).ascending());
			}
			
			Page<NewsVo> newsList=nr.findAll(pageable);
			model.addAttribute("newsList", newsList);
			return "/news/list2";
		}
	   
	   @GetMapping("/modify")
		public String modify(Model model, int news_num) {
			
		   	nr.updateView(news_num);
			model.addAttribute("news",nr.modifyNews(news_num));
			model.addAttribute("newsList", nr.otherNews());
			return "/news/modify";	
		}
	   @GetMapping("/addNews")
		public String addNews(Model model) {
		   
		   model.addAttribute("count",nr.getNewsCount());
			return "/news/addNews";	
		}
	   @PostMapping("/insertNews")
		public String insertNews(NewsVo newsVo, HttpSession session,FileDTO dto) {
			MultipartFile uploadfile = dto.getUploadfile();
			String fileName = newsVo.getMainImg();
			if (uploadfile != null) {			
				dto.setImg_name(fileName);
				try {
					File file = new File("C:\\Users\\mom\\Desktop\\uefa\\uefa_project\\src\\main\\resources\\static\\img\\news\\" + fileName);
					uploadfile.transferTo(file);
				} catch (IOException e) {
					e.printStackTrace();
				} 
			} 
			boolean insert=false;
			try {	
					NewsVo createNews=nr.save(newsVo);
					if(createNews!=null) {
						insert=true;
					}	
			}catch(Exception e){
				e.printStackTrace();
			}
			if(insert) {
				return "redirect:/admin/news/list/1";			
			}else {
				return "redirect:/news/addNews";
			}
		}
	   @PostMapping("/newsDelete")
		  public String newsDelete(HttpServletRequest request, int news_num){
			  
				nr.deleteNews(news_num);
					  	
			  return "redirect:/admin/news/list/1";
	   	}
}

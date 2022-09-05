package com.uefa.controller;

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
import org.springframework.web.servlet.ModelAndView;

import com.uefa.repository.MemberRepository;
import com.uefa.vo.MemberVo;

@Controller
@RequestMapping("/mem")
public class MemberController {
   @Autowired
   MemberRepository mr;
   
   @GetMapping("list/{page}")
	public String list(@PathVariable int page,
						@RequestParam(defaultValue = "signupTime") String sort,
						@RequestParam(defaultValue = "desc") String desc ,
						Model model) {
	   	int size=10;
		Pageable pageable=null;
		if(desc.equals("desc")) {
			pageable=PageRequest.of(page-1,  size, Sort.by(sort).descending());
		}else if(desc.equals("asc")) {
			pageable=PageRequest.of(page-1, size, Sort.by(sort).ascending());
		}
		
		Page<MemberVo> memList=mr.findAll(pageable);
		model.addAttribute("memList", memList);
		return "mem/list";
	}
   	
   	@GetMapping("/modify")
	public String modify(Model model,String id) {
		
		model.addAttribute("member",mr.modifyMember(id));

		return "/mem/modify";	
	}
	@PostMapping("/update")
	public String insert(MemberVo mem, HttpSession session) {
		boolean update=false;
		try {	
				MemberVo updateMember=mr.save(mem);
				if(updateMember!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/mem/list/1";			
		}else {
			return "redirect:/mem/modify";
		}	
	}

   
   @GetMapping(value="/login")
   public String login() {
	   return "mem/login";
   }
   @PostMapping("/login")
   public String login(String id, String pw, HttpSession session) {
	   System.out.println(id);
	   System.out.println(pw);
	   MemberVo memVo = mr.findByIdAndPw(id, pw);
	   System.out.println(memVo);
	   if(memVo != null) {
		   session.setAttribute("memVo", memVo);
		   return "redirect:/";
		   
	   }else {
		   return "redirect:/mem/login";
	   }
   }
   
   @GetMapping("/signup")
   public ModelAndView sighnup(ModelAndView model) {
	   model.setViewName("mem/signup");
	   return model;
   }
   
   @PostMapping("/signup")
   public ModelAndView signup(ModelAndView model, MemberVo memVo) {
	   MemberVo insertMem = mr.save(memVo);
	   model.setViewName("redirect:/mem/login");
	   System.out.println(insertMem);
	   return model;
   }
   @GetMapping("/logout")
   public String logout(HttpSession session) {
	   session.removeAttribute("memVo");
	   return "redirect:/";
   }
   @PostMapping("/memberDelete")
   public String memberDelete(HttpServletRequest request, String id){
	  
		mr.deleteMember(id);
			  	
	  return "redirect:/mem/list/1";
   }
}

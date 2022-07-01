package com.uefa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uefa.repository.MemberRepository;
import com.uefa.vo.MemberVo;

@Controller
@RequestMapping("/mem")
public class MemberController {
   @Autowired
   MemberRepository mr;
   
   @GetMapping("list.do")
	public String list(Model model) {
		Iterable<MemberVo> memList = mr.findAllByOrderByIdAsc();
		model.addAttribute("memList", memList);
		return "mem/list";
	}
   
   @GetMapping("update.do")
	public String insert(Model model) {
		Iterable<MemberVo> memList = mr.findAllByOrderByIdAsc();
		model.addAttribute("memList", memList);
		return "mem/modify";
	}
	@PostMapping("update.do")
	public String insert(MemberVo mem, HttpSession session) {
		//boolean insert = false;
		return "redirect:/mem/list.do";
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
	   model.setViewName("redirect:/");
	   System.out.println(insertMem);
	   return model;
   }
   @GetMapping("/logout")
   public String logout(HttpSession session) {
	   session.removeAttribute("memVo");
	   return "redirect:/";
   }

}

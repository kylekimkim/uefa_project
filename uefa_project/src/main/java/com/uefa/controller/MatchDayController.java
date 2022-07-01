package com.uefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.repository.MatchDayRepository;


@Controller
@RequestMapping("/match")
public class MatchDayController {
	@Autowired
	MatchDayRepository mdr;
	
	@GetMapping("/list.do")
	public String list(Model model) {	
		model.addAttribute("eplMatch", mdr.eplMatchByOrderByMatchDateDesc(1));
		return "/match/list";
	}
	
}

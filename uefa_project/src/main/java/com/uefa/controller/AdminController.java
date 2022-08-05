package com.uefa.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.repository.MatchDay2223Repository;
import com.uefa.repository.MatchDayRepository;
import com.uefa.vo.MatchDay2223Vo;
import com.uefa.vo.MatchDayVo;

@Controller
@RequestMapping("/admin/match")
public class AdminController {
	@Autowired
	MatchDayRepository mdr;
	@Autowired
	MatchDay2223Repository mdr2;
	
	@GetMapping("/2122/list.do")
	public String list(Model model) {	
		model.addAttribute("Aug", mdr.AugMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Sep", mdr.SepMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Oct", mdr.OctMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Nov", mdr.NovMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Dec", mdr.DecMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Jan", mdr.JanMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Feb", mdr.FebMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Mar", mdr.MarMatchByOrderByMatchDateDesc(1));
		model.addAttribute("Api", mdr.ApiMatchByOrderByMatchDateDesc(1));
		model.addAttribute("May", mdr.MayMatchByOrderByMatchDateDesc(1));
		return "/admin/match/2122/list";
	}
	
	@GetMapping("/2122/listLaliga")
	public String listLaliga(Model model) {	
		model.addAttribute("Aug", mdr.AugMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Sep", mdr.SepMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Oct", mdr.OctMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Nov", mdr.NovMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Dec", mdr.DecMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Jan", mdr.JanMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Feb", mdr.FebMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Mar", mdr.MarMatchByOrderByMatchDateDesc(2));
		model.addAttribute("Api", mdr.ApiMatchByOrderByMatchDateDesc(2));
		model.addAttribute("May", mdr.MayMatchByOrderByMatchDateDesc(2));
		return "/admin/match/2122/listLaliga";
	}
	@GetMapping("/2122/listBundes")
	public String listBundes(Model model) {	
		model.addAttribute("Aug", mdr.AugMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Sep", mdr.SepMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Oct", mdr.OctMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Nov", mdr.NovMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Dec", mdr.DecMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Jan", mdr.JanMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Feb", mdr.FebMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Mar", mdr.MarMatchByOrderByMatchDateDesc(3));
		model.addAttribute("Api", mdr.ApiMatchByOrderByMatchDateDesc(3));
		model.addAttribute("May", mdr.MayMatchByOrderByMatchDateDesc(3));
		return "/admin/match/2122/listBundes";
	}
	@GetMapping("/2122/listSerie")
	public String listSerie(Model model) {	
		model.addAttribute("Aug", mdr.AugMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Sep", mdr.SepMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Oct", mdr.OctMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Nov", mdr.NovMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Dec", mdr.DecMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Jan", mdr.JanMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Feb", mdr.FebMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Mar", mdr.MarMatchByOrderByMatchDateDesc(4));
		model.addAttribute("Api", mdr.ApiMatchByOrderByMatchDateDesc(4));
		model.addAttribute("May", mdr.MayMatchByOrderByMatchDateDesc(4));
		return "/admin/match/2122/listSerie";
	}
	@GetMapping("/2122/listAng")
	public String listAng(Model model) {	
		model.addAttribute("Aug", mdr.AugMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Sep", mdr.SepMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Oct", mdr.OctMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Nov", mdr.NovMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Dec", mdr.DecMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Jan", mdr.JanMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Feb", mdr.FebMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Mar", mdr.MarMatchByOrderByMatchDateDesc(5));
		model.addAttribute("Api", mdr.ApiMatchByOrderByMatchDateDesc(5));
		model.addAttribute("May", mdr.MayMatchByOrderByMatchDateDesc(5));
		return "/admin/match/2122/listAng";
	}
	@GetMapping("/2223/list.do")
	public String list2223(Model model) {	
		model.addAttribute("Aug", mdr2.AugMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Sep", mdr2.SepMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Oct", mdr2.OctMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Nov", mdr2.NovMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Dec", mdr2.DecMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Jan", mdr2.JanMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Feb", mdr2.FebMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Mar", mdr2.MarMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("Api", mdr2.ApiMatch2223ByOrderByMatchDateDesc(1));
		model.addAttribute("May", mdr2.MayMatch2223ByOrderByMatchDateDesc(1));
		return "/admin/match/2223/list";
	}
	
	@GetMapping("/2223/listLaliga")
	public String listLaliga2223(Model model) {	
		model.addAttribute("Aug", mdr2.AugMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Sep", mdr2.SepMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Oct", mdr2.OctMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Nov", mdr2.NovMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Dec", mdr2.DecMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Jan", mdr2.JanMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Feb", mdr2.FebMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Mar", mdr2.MarMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("Api", mdr2.ApiMatch2223ByOrderByMatchDateDesc(2));
		model.addAttribute("May", mdr2.MayMatch2223ByOrderByMatchDateDesc(2));
		return "/admin/match/2223/listLaliga";
	}
	@GetMapping("/2223/listBundes")
	public String listBundes2223(Model model) {	
		model.addAttribute("Aug", mdr2.AugMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Sep", mdr2.SepMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Oct", mdr2.OctMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Nov", mdr2.NovMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Dec", mdr2.DecMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Jan", mdr2.JanMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Feb", mdr2.FebMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Mar", mdr2.MarMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("Api", mdr2.ApiMatch2223ByOrderByMatchDateDesc(3));
		model.addAttribute("May", mdr2.MayMatch2223ByOrderByMatchDateDesc(3));
		return "/admin/match/2223/listBundes";
	}
	@GetMapping("/2223/listSerie")
	public String listSerie2223(Model model) {	
		model.addAttribute("Aug", mdr2.AugMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Sep", mdr2.SepMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Oct", mdr2.OctMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Nov", mdr2.NovMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Dec", mdr2.DecMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Jan", mdr2.JanMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Feb", mdr2.FebMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Mar", mdr2.MarMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("Api", mdr2.ApiMatch2223ByOrderByMatchDateDesc(4));
		model.addAttribute("May", mdr2.MayMatch2223ByOrderByMatchDateDesc(4));
		return "/admin/match/2223/listSerie";
	}
	@GetMapping("/2223/listAng")
	public String listAng2223(Model model) {	
		model.addAttribute("Aug", mdr2.AugMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Sep", mdr2.SepMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Oct", mdr2.OctMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Nov", mdr2.NovMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Dec", mdr2.DecMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Jan", mdr2.JanMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Feb", mdr2.FebMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Mar", mdr2.MarMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("Api", mdr2.ApiMatch2223ByOrderByMatchDateDesc(5));
		model.addAttribute("May", mdr2.MayMatch2223ByOrderByMatchDateDesc(5));
		return "/admin/match/2223/listAng";
	}
	@GetMapping("/2122/modify")
	public String modify(Model model,int matchNum) {
		
		model.addAttribute("match",mdr.modifyMatch(matchNum));

		return "/admin/match/2122/modify";	
	}
	@GetMapping("/2223/modify")
	public String modify2223(Model model,int matchNum) {
		
		model.addAttribute("match",mdr2.modifyMatch2223(matchNum));

		return "/admin/match/2223/modify";	
	}
	@PostMapping("/2122/update")
	public String update(MatchDayVo matchVo, HttpSession session) {
		boolean update=false;
		try {	
				MatchDayVo updateMatch=mdr.save(matchVo);
				if(updateMatch!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/admin/match/2122/list.do";			
		}else {
			return "redirect:/admin/match/2122/modify";
		}
		
	}
	@PostMapping("/2223/update")
	public String update2223(MatchDay2223Vo matchVo, HttpSession session) {
		boolean update=false;
		try {	
				MatchDay2223Vo updateMatch=mdr2.save(matchVo);
				if(updateMatch!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/admin/match/2223/list.do";			
		}else {
			return "redirect:/admin/match/2223/modify";
		}
		
	}
}
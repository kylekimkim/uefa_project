package com.uefa.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uefa.repository.MatchDayRepository;
import com.uefa.vo.MatchDayVo;


@Controller
@RequestMapping("/match")
public class MatchDayController {
	@Autowired
	MatchDayRepository mdr;
	
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
		model.addAttribute("nowDate",LocalDateTime.now());
		return "/match/2122/list";
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
		return "/match/2122/listLaliga";
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
		return "/match/2122/listBundes";
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
		return "/match/2122/listSerie";
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
		return "/match/2122/listAng";
	}
}

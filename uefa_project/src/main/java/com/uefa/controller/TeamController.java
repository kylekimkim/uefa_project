package com.uefa.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uefa.repository.MatchDay2223Repository;
import com.uefa.repository.MatchDayRepository;
import com.uefa.repository.MemberRepository;
import com.uefa.repository.Team2223Repository;
import com.uefa.repository.TeamRepository;
import com.uefa.vo.MemberVo;
import com.uefa.vo.Team2223Vo;
import com.uefa.vo.TeamVo;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamRepository tr;
	@Autowired
	Team2223Repository tr2;
	@Autowired
   	MemberRepository mr;
	@Autowired
	MatchDayRepository mdr;
	@Autowired
	MatchDay2223Repository mdr2;
		
	@GetMapping("/list.do")
	public String list(Model model) {	
		model.addAttribute("eplList", tr.rankByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr.rankByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr.rankByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr.rankByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr.rankByOrderByVictoryPointsDesc(5));
		return "/team/list";
	}
	@GetMapping("/2223/list.do")
	public String list2223(Model model) {	
		model.addAttribute("eplList", tr2.rank2223ByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr2.rank2223ByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr2.rank2223ByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr2.rank2223ByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr2.rank2223ByOrderByVictoryPointsDesc(5));
		return "/team/2223/list";
	}
	
	@GetMapping("/rank.do")
	public String rank(Model model) {
		model.addAttribute("eplList", tr.rankByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr.rankByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr.rankByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr.rankByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr.rankByOrderByVictoryPointsDesc(5));
		return "/team/rank";
	}
	@GetMapping("/2223/rank.do")
	public String rank2223(Model model) {
		model.addAttribute("eplList", tr2.rank2223ByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr2.rank2223ByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr2.rank2223ByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr2.rank2223ByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr2.rank2223ByOrderByVictoryPointsDesc(5));
		return "/team/2223/rank";
	}
	@GetMapping("/modify")
	public String modify(Model model,int teamNum) {
		
		model.addAttribute("team",tr.modifyTeam(teamNum));

		return "/team/modify";	
	}
	@GetMapping("/2223/modify")
	public String modify2223(Model model,int teamNum) {
		
		model.addAttribute("team",tr2.modifyTeam2223(teamNum));

		return "/team/2223/modify";	
	}
	@GetMapping("/insert")
	public ModelAndView insert(ModelAndView model) { 
		model.setViewName("/team/insert");
		return model;
	}
	@PostMapping("/update")
	public String update(TeamVo teamVo, HttpSession session) {
		boolean update=false;
		try {	
				TeamVo updateTeam=tr.save(teamVo);
				if(updateTeam!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/team/list.do";			
		}else {
			return "redirect:/team/modify";
		}
		
	}
	@PostMapping("/2223/update")
	public String update(Team2223Vo teamVo, HttpSession session) {
		boolean update=false;
		try {	
				Team2223Vo updateTeam=tr2.save(teamVo);
				if(updateTeam!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/team/2223/list.do";			
		}else {
			return "redirect:/team/2223/modify";
		}
		
	}
	@GetMapping("/myteam")
	public String myteam(Model model,int teamNum) {

		model.addAttribute("team",tr.modifyTeam(teamNum));
		model.addAttribute("logo",tr.myteamLogo(teamNum));
		model.addAttribute("myteam",mdr.matchMyteam(teamNum));
		model.addAttribute("myteam2223",mdr2.matchMyteam2223(teamNum));
		return "/team/myteam";	
	}
	@GetMapping("/select")
	public String selectMyteam(Model model,String id) {
		
		model.addAttribute("member", mr.modifyMember(id));
		model.addAttribute("team", tr.findAll());
		
		return "/team/select";	
	}
	@PostMapping("/select")
	public String select(MemberVo memVo, HttpSession session) {
		boolean update=false;
		try {	
				MemberVo updateMem=mr.save(memVo);
				if(updateMem!=null) {
					update=true;
				}	
		}catch(Exception e){
			e.printStackTrace();
		}
		if(update) {
			return "redirect:/mem/logout";			
		}else {
			return "redirect:/";
		}
		
	}
}

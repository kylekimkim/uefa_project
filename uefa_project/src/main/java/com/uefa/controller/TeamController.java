package com.uefa.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.uefa.repository.TeamRepository;
import com.uefa.vo.TeamVo;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamRepository tr;
		
	@GetMapping("/list.do")
	public String list(Model model) {	
		model.addAttribute("eplList", tr.rankByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr.rankByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr.rankByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr.rankByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr.rankByOrderByVictoryPointsDesc(5));
		return "/team/list";
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
	@GetMapping("/modify")
	public String modify(Model model,int teamNum) {
		
		model.addAttribute("team",tr.modifyTeam(teamNum));

		return "/team/modify";	
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
	/*
	 * @PostMapping("/insert") public String insert(TeamVo teamVo, HttpSession
	 * session) { boolean insert=false; try { Optional<TeamVo>
	 * teamOption=tr.findById(teamVo.getTeamNum()); // 기본으로 제공되는 함수
	 * if(teamOption.isEmpty()) { TeamVo insertTeam=tr.save(teamVo);
	 * if(insertTeam!=null) { insert=true; } } }catch(Exception e){
	 * e.printStackTrace(); session.setAttribute("msg", "팀이 이미 존재합니다."); }
	 * if(insert) { return "redirect:/team/list"; }else { return
	 * "redirect:/team/insert"; }
	 * 
	 * }
	 */
}

package com.uefa.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uefa.repository.TeamRepository;
import com.uefa.vo.TeamVo;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamRepository tr;
		
	@GetMapping("/list/{page}")
	public String pageableList( @PathVariable int page,
								@RequestParam(defaultValue = "teamNum") String sort,
								@RequestParam(defaultValue = "asc") String desc ,
								Model model) {
		int size=10;
		Pageable pageable=null;
		if(desc.equals("desc")) {
			pageable=PageRequest.of(page-1, size, Sort.by(sort).descending());			
		}else if(desc.equals("asc")) {
			pageable=PageRequest.of(page-1, size, Sort.by(sort).ascending()); 		
		}

		
		Page<TeamVo> teamList=tr.findAll(pageable);
		
		
		model.addAttribute("teamList", teamList);
		return "/team/list";
	}
	
	@GetMapping("/rank.do")
	public String rank(Model model) {
		model.addAttribute("eplList", tr.eplByOrderByVictoryPointsDesc(1));
		model.addAttribute("laligaList", tr.laligaByOrderByVictoryPointsDesc(2));
		model.addAttribute("bundesList", tr.bundesByOrderByVictoryPointsDesc(3));
		model.addAttribute("serieList", tr.serieByOrderByVictoryPointsDesc(4));
		model.addAttribute("angList", tr.angByOrderByVictoryPointsDesc(5));
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
	public String insert(TeamVo teamVo, HttpSession session) {
		boolean update=false;
		try {
				
				TeamVo updateTeam=tr.save(teamVo);
				if(updateTeam!=null) {
					update=true;
				}else {
					session.setAttribute("msg", "이미 존재하는 이름 입니다.");
				}	
			
		}catch(Exception e){
			e.printStackTrace();
			session.setAttribute("msg", "추가에 실패하였습니다.");
		}
		if(update) {
			return "redirect:/";			
		}else {
			return "redirect:/team/modify";
		}
		
	}
}

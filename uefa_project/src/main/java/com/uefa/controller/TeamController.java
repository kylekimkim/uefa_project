package com.uefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uefa.repository.TeamRepository;
import com.uefa.vo.TeamVo;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamRepository tr;
	
	
	  @GetMapping("/list.do") public String list(Model model) { Iterable<TeamVo>
	  teamList=tr.findAll(); model.addAttribute("teamList",teamList); return
	  "team/list"; }
	 
	
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
}

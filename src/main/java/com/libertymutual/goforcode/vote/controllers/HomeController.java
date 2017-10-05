package com.libertymutual.goforcode.vote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("")
	public String home() {
		return "/home/names";
	}
	
	@PostMapping("vote")
	public ModelAndView showProjects() {
		ModelAndView mv = new ModelAndView("vote/index");
		return mv;
	}
	
	
	
}

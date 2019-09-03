package com.practice2019.PracticeSite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PracticeController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "firstPage", "Hello World!");
	}

}

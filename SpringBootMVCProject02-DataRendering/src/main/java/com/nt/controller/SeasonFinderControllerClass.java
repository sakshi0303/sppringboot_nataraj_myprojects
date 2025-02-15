package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IService;

@Controller
public class SeasonFinderControllerClass {
	
	@Autowired
	private IService service;
	
	@RequestMapping("/")
	public String showhomepage() {
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String showseasson(Map<String, Object> map){ //shareable BindingAwareModelMap Object bydefault: requestScope
		String msg=service.findSeasonbasedonMonth();
		map.put("seasonname", msg);
		return "season";
	}

}

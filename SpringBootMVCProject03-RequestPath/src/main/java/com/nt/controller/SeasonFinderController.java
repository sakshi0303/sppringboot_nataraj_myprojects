package com.nt.controller;

import java.sql.DatabaseMetaData;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Customer;
import com.nt.service.ISeasonFinder;

@Controller
public class SeasonFinderController {
	
	@Autowired
	private ISeasonFinder season;
	
	//@RequestMapping("/") by default requestmapping has ("\")
	@RequestMapping
	public String showHomePage() {
		System.out.println("SeasonFinderController.showHomePage()");
		return "home";
	}
	
	
	@RequestMapping("/season")
	public String showseason(Map<String, String> map) {
		String seasonname=season.findseason();
		map.put("seasonname", seasonname);
		return "season";
	}
	
	/// request path is case sensitive
	@RequestMapping({"/HOME","/show","/data"})
	public String showdata1() {
		System.out.println("SeasonFinderController.showdata1()");
		return "show_data1";
	}
	
	@RequestMapping("/home")
	public String showdata2() {
		System.out.println("SeasonFinderController.showdata2()");
		return "show_data2";
	}
	
	@RequestMapping(value="/getandpost", method=RequestMethod.GET)
	//@GetMapping("/getandpost")
	public String Requests4mBrowser() {
		return "home";
	}
	
	@RequestMapping(value="/getandpost",method = RequestMethod.POST)
	@PostMapping("/getandpost") // get and post map to same url
	public String hello() {
		return "home";
	}
	// storing simple data
	@GetMapping("/data")
	public String getdata(Map<String, Object> map) {
		map.put("name","sakshi" );		
		map.put("age", 30);
		return "data";
	}
	
	// storing arrays and Collections
	@GetMapping("/getdataThrowughArrayandCollection")
	public String ArrayandCollection(Map<String, Object> map) {
	// by DEFAULT ARRAY WILL GIVE hascode as it does not have toString method, rest aother collection have toString()
		map.put("favColor", new String[] {"red","green","yellow"});
		map.put("friendlist", List.of("swarna","sakshi"));
		map.put("phoneno", Set.of(123323,999343219));
		map.put("iddetails",Map.of("adharid","ABDKJS","voterid","VVV","passport","PP"));
		
		return "data";
	}
	
	@GetMapping("/modelDataPassingFromHandlertoVIewJSP")
	public String passingdatafromModeltoViewJSP(Map<String, Object> map) {
		Customer cust=new Customer(1, "sakshi", "seattle", 98.9f);
		map.put("custData", cust);
		return "data";
		
	}
}

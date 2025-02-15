package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShowHomeController {
	
	@Autowired
	private ServletConfig cg;
	
	@Autowired
	private ServletContext ct;
	
	@RequestMapping("/")
	public String showHome(Map<String, Object> map) { //java code, if framework chnges it doent matter
		
		System.out.print("showHome() map is refering to ::::"+map.getClass());//generic non evasive
		// As soon as Dispatcher Servlet see map as input, 
		// it will create internal  
		map.put("age", "23");
		map.put("name","sakshi");
		map.put("date",new Date());
		return "welcome"; // logical view name
	}
	
//	@RequestMapping("/")
//	public String showdata(Model model) {//spring specifix parameter, non elasive ModelType evasive
//		model.addAttribute("nameodel", "yes");
//		model.addAttribute("hellpwmpdel", "12");
//		
//		return "welcome";
//	}
	
	//return type as model
	//1) no parameter, so we are force to  create shared obj model manualluy
	//2) return type is model so LogicalVieName will be by defaultt the request parameter. home
	//3) missing logicalviewname
	//4) we cannot take request path as / as it will / cannot be logical view name
	@RequestMapping("/home")
	public Model displayData() {
		Model model=new BindingAwareModelMap();
		model.addAttribute("key", "val");
		model.addAttribute("key1", "val1");
		return model;
		
	}
//	1) return type map, so shared obj will be created by us manually, instead of dispacter servlet
//	2) lvn will be request paramete home1
//	3) can not take @RequestParam as "/" alone as it "/" cannot be lvn
//	
	@RequestMapping("/home1")
	public Map<String, Object> getdata(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		return map;
	}
	
	@RequestMapping("/forwardrequestexample")
	public String frwardrequestfromStringOneHandlerToAnotherHandler(Map<String, String> map) {
		map.put("forward", " sorce handler method talks with destination handler method directly by calling forward method, due to this they share same req,res obj");
		return "forward:report";
	}
	
	@RequestMapping("/report")
	public String getdata1() {
		return "get_data";
	}
	
	@RequestMapping("/RedirectionalRequestexample")
	public String getdata2(Map<String, String> map,HttpServletRequest req,HttpSession ses,HttpServletResponse res) {
		System.out.println("server name---->"+cg.getServletName());
		System.out.println("webapplication name---->"+ct.getContextPath());
		map.put("redirect", "  src handler method and destination handler method talks with network roundtrip  with browser, therefore they have differnt req, and res objs, broweser url with change");
		req.setAttribute("httpServletRequest_req", "valueof httpservletReques ");
		ses.setAttribute("httpSession_ses", "value of session");
		return "get_data";
//return "redirect:report"; // in redirect source and destination handle have differnt req, and res there all data is not shown in jsp file
	}
	
	@RequestMapping("/direct")
	public void displaydirectly(HttpServletResponse res) throws IOException {
	PrintWriter pw=res.getWriter();
	//res.setContentType("HTML/TEXT"); // download file in text format with FileName as "direct" //usefull in downloading file or all places where presentation logic is not mentioned
	res.setContentType("TEXT/HTML");
	res.setHeader("Content-Disposition", "attachment;fileName=abc.html");
	pw.println("<b> Direct Content with Privntwitter res.getWritter() res.setContentType(TEXT-HTML) </b>");
	pw.close();
	}
	
	
	

}

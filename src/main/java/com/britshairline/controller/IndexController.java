package com.britshairline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index") //define which url the mothod which foll. req. mapping annotation
	public String Index(){
		return "/WEB-INF/jsp/index.jsp";
	}
} 
 
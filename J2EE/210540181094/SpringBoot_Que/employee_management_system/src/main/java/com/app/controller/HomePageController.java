package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	public HomePageController() {
		System.out.println("in home page controller");
	}
	
	@PostConstruct
	public void myinit() {
		System.out.println("in init method");
	}
	
	
	@RequestMapping(value = "/")
	public String indexPage() {
		System.out.println("in index page");
		return "/index";
	}
	
}

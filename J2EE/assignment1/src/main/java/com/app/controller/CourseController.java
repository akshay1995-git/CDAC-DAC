package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Course;
import com.app.service.CourseServiceImpl;
import com.app.service.ICourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	public CourseController() {
		System.out.println("in ctor of "+getClass().getName());
	}
	//add request method to list all courses
	@GetMapping("/list")
	public String listCourses(Model map) {
		
		System.out.println("in list courses");
		map.addAttribute("course_list", courseService.getAllCourseTitles());
		return "/courses/list";
	}
	
	
	}

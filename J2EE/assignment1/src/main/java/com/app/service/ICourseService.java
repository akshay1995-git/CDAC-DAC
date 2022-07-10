package com.app.service;

import java.util.List;

import com.app.pojos.Course;

public interface ICourseService {
	List<String> getAllCourseTitles();
	
	//controller will supply course title to service layer
	String cancelCourse(String title);
	
	//get course + enrolled student details (for course details page)
	Course getCompleteCourseDetails(String title);
}

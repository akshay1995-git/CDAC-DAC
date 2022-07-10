package com.app.dao;

import java.util.List;

import com.app.pojos.Course;

public interface ICourseDao {
	List<String> getAllCourseTitles();

	String cancelCourse(Course course);

	// get ONLY course details
	Course getCourseDetails(String title);

	// get course + enrolled student details
	Course getCompleteCourseDetails(String title);
}

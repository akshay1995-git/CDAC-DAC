package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICourseDao;
import com.app.pojos.Course;

@Service
@Transactional
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private ICourseDao courseDao;

	@Override
	public List<String> getAllCourseTitles() {
		// TODO Auto-generated method stub
		return courseDao.getAllCourseTitles();
	}

	@Override
	public String cancelCourse(String title) {
		String mesg = "Cancelling course failed";
		Course course = courseDao.getCourseDetails(title);
		if (course != null)
			mesg = courseDao.cancelCourse(course);
		return mesg;

	}

	@Override
	public Course getCompleteCourseDetails(String title) {
		// TODO Auto-generated method stub
		return courseDao.getCompleteCourseDetails(title);
	}

}

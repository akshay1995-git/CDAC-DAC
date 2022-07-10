package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Course;
import com.app.pojos.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	//Dependency : CourseDao i/f
	@Autowired
	private ICourseDao courseDao;
	

	@Override
	public String admitStudent(Student student, String courseTitle) {
		String mesg="Student admission failed!!!!";
		//get course details from course id
		Course course=courseDao.getCourseDetails(courseTitle);
		if(course != null)
		{
			course.addStudent(student);//establish bi-dir relationship here.
			mesg="Student "+student.getName()+" admitted in Course "+courseTitle;
		}
		return mesg;
	}

}

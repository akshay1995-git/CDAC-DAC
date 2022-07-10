package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Course;

@Repository
public class CourseDaoImpl implements ICourseDao {
	@Autowired
	private EntityManager manager;

	@Override
	public List<String> getAllCourseTitles() {
		String jpql = "select c.title from Course c";
		return manager.createQuery(jpql, String.class).getResultList();
	}

	@Override
	public String cancelCourse(Course course) {
		manager.remove(course);
		return "Course with ID = " + course.getId() + " deleted successfully";
	}

	@Override
	public Course getCourseDetails(String title) {
		String jpql = "select c from Course c where c.title=:courseTitle";
		return manager.createQuery(jpql, Course.class).setParameter("courseTitle", title).getSingleResult();
	} //rets ONLY course details

	@Override
	public Course getCompleteCourseDetails(String title) {
		String jpql = "select c from Course c left outer join fetch c.students where c.title=:courseTitle";
		return manager.createQuery(jpql, Course.class).setParameter("courseTitle", title).getSingleResult();
	} //rets Course + enrolled student details

}

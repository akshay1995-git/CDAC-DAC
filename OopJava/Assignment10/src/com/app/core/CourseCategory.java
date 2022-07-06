package com.app.core;

public enum CourseCategory {
	 DBT,REACT,ANGULAR,REST,SPRING,HIBERNATE;
	 public String toString() {
			return "Course-Category " + name().toUpperCase();
		}
}

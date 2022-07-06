package com.app.core;

public enum Category {
	FULLSTACK,MEANSTACK,MERNSTACK,DATABASE,FRONTEND;
	public String toString() {
		return "Course-Category " + name().toUpperCase();
	}
}

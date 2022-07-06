package com.app.core;

public enum Category {
        SILVER,GOLD,PLATINUM;
	public String toString() {
		return "Category " + name().toUpperCase();
	}
}

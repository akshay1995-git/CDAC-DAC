package com.app.core;

import java.io.Serializable;

public class Player implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private  int id;
private String name;
private int rank;
private double points;

public Player(int id, String name, int rank, double points) {
	super();
	this.id = id;
	this.name = name;
	this.rank = rank;
	this.points = points;
}

public Player(int id) {
	// TODO Auto-generated constructor stub
	this.id=id;
}

@Override
public String toString() {
	return "Player [id=" + id + ", name=" + name + ", rank=" + rank + ", points=" + points + "]";
}

public boolean equals(Player obj) {
	return (id==obj.id && name.equals(obj.name));
}
public int hashCode() {
	return id;
}
}

package com.greatlearning.construction.model;

public class FactoryClass implements Comparable<FactoryClass> {
	int day;
	int floor;

	public FactoryClass(int day, int floor) {
		this.day = day;
		this.floor = floor;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int compareTo(FactoryClass o) {
		if (floor == o.floor)
			return 0;
		else if (floor > o.floor)
			return -1;
		else
			return 1;
	}
}

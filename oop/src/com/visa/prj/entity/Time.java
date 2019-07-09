package com.visa.prj.entity;

public class Time {
	public int hours;
	public int minutes;
	
	public Time(int hrs,int min) {
		this.hours = hrs;
		this.minutes = min;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMin() {
		return this.minutes;
	}
	
	public static Time addTime(Time t1, Time t2) {
		Time t3 = new Time(0,0);
		t3.hours = t1.hours + t2.hours;
		if((t1.minutes + t2.minutes) >= 60) {
			t3.hours ++;
			t3.minutes = t1.minutes + t2.minutes - 60;
		}
		else {
			t3.minutes = t1.minutes + t2.minutes;
		}
		return t3;
		
	}
}

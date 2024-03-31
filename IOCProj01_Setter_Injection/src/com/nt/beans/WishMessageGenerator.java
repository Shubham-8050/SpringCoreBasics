package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	//Setter Injection
	public Date date;

	//to check object
	public WishMessageGenerator() {
		System.out.println("## Constructor called ##");
	}

	//Setter method
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getWishGenerator(String name) {
		int hour = date.getHours();
		if(hour<12) {
			return "good morning "+name;
		}else if(hour<16) {
			return "good afternoon "+name;
		}else {
			return "Good night "+name;
		}
	}
	
}

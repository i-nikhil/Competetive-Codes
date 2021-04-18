package com.nagarro.javatraining.assignment1.Outcome;

import com.nagarro.javatraining.assignment1.constant.Item;

public class Show {
	public static void displayResult(Item i)
	{
		String str = String.format("%-14s%-15.3f%-18.3f%-25.3f%-7d%-15.3f", i.getName(),i.getPrice(),i.gettax(),i.getFppi(),i.getQty(),i.getTotal_Price());
		System.out.println(str);
	}
/*
	public static void displayResultFormat() {
		System.out.println("\n\n\nOutput:");
		String str = String.format("%-14s%-15s%-18s%-25s%-7s%-15s", "Name","Price","tax liability","Final Price per Item","Qty","Total Price");
		System.out.println(str);
	}
	
	*/
}


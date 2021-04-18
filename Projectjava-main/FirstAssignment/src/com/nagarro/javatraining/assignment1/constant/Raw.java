package com.nagarro.javatraining.assignment1.constant;

public class Raw extends Item  {
	
	public Raw(String name, String type, Double price, int qty) {
		super(name, type, price, qty);
	}

	public void calc_tax() 
	{
		tax = KeepConstant.TAX_RATE_RAW * price ; 
		fppi = price + tax ;
	}
	

}




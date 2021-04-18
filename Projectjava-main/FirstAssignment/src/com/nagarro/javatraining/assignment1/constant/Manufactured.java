package com.nagarro.javatraining.assignment1.constant;

public class Manufactured extends Item {

	public Manufactured(String name, String type, Double price, int qty) {
		super(name, type, price, qty);
	}
	public void calc_tax() 
	{
		tax = KeepConstant.TAX_RATE_MANUFACTURED* price + (1+KeepConstant.TAX_RATE_MANUFACTURED) * price * KeepConstant.SURCHRGE_RATE_MANUFACTURED; 
		fppi = price + tax ;
	}

}


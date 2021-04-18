package com.nagarro.javatraining.assignment1.constant;

public class Imported extends Item {
	
	public Imported(String name, String type, Double price, int qty) {
		super(name, type, price, qty);

	}
		
		public void calc_tax() 
		{
			tax = KeepConstant.IMPORT_DUTY_IMPORTED* price ;
			fppi = price + tax;
			if (fppi<=100)
			{
				tax += 5 ;
				fppi+=5 ;
			}
			else if (fppi>100 && fppi<=200)
			{
				tax += 10 ;
				fppi+=10 ;
			}
			else if (fppi>200)
			{
				fppi = 1.05 * fppi ;
				tax = fppi - price ;
			}
		}

}

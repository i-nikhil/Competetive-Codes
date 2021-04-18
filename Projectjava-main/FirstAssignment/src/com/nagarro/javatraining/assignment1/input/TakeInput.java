package com.nagarro.javatraining.assignment1.input;
import com.nagarro.javatraining.assignment1.constant.*;

import java.io.IOException;
import java.util.Scanner;


public class TakeInput
{
	static Scanner sc=new Scanner(System.in);
	public static Item enterInput() throws IOException
	{

		String name ;
		String str ;
		String type ;
		double price ;
		int qty ;
		boolean valid ,valid1, valid2;
		System.out.println("\nEnter the Item Details :");
		System.out.print("Enter the Item name : ");
		name = sc.next();

		System.out.print("Enter the Item price : ");
		do{
			str = sc.next();
			valid1  = Validate.checkDouble(str);
			valid2  = Validate.checkPNegative(Double.parseDouble(str));
		} while(!(valid1 && valid2)) ;
		price=Double.parseDouble(str);

		System.out.print("Enter the Item type : ");
		do{
			str = sc.next();
			valid  = Validate.checkItemType(str);
		}while(!valid) ;
		type = str.toLowerCase() ;

		
		System.out.print("Enter the Item Qty : ");
		do{
			str = sc.next();
			valid1  = Validate.checkInt(str);

			if(!valid1)
				continue;
			valid2 = Validate.checkNegative(Integer.parseInt(str));
		}while(!(valid1 && valid2));
		qty = Integer.parseInt(str);


		Item i ;
		switch(type)
		{
			case KeepConstant.RAW :
				i = new Raw(name,type,price,qty);
				break ;
			case KeepConstant.MANUFACTURED :
				i = new Manufactured(name,type,price,qty);
				break ;
			default :
				i = new Imported(name,type,price,qty);
				break ;

		}
		return i ;
	}

}

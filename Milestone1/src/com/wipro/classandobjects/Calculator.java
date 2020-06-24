package com.wipro.classandobjects;

public class Calculator {
	static double powerInt(int num1,int num2)
	{
		
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	public static void main(String[]args)
	{
		Calculator c=new Calculator();
		System.out.println(powerInt(8,3));
		System.out.println(powerDouble(8.5,3));
				
	}
}

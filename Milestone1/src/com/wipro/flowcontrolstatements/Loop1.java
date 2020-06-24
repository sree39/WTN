package com.wipro.flowcontrolstatements;

public class Loop1 {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("The given number"+ a +"is positive");
		}
		else if(a<0)
		{
			System.out.println("The given number"+ a +"is negative");
		}
		else
		{
			System.out.println("The given number"+ a +"is Zero");
		}
			
			
	}

}

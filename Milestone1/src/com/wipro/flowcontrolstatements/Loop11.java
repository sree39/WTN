package com.wipro.flowcontrolstatements;

public class Loop11 {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int i;
		for(i=a;i<=b;i++) {
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
			
	}

}

package com.wipro.flowcontrolstatements;

public class Loop18 {
	public static void main(String[]args)
	{
		int num=Integer.parseInt(args[0]);
		int rev=0;
		int x=num;
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(x==rev) {
		System.out.println(x+" "+"is a palindrome");
		}
		else
		{
		  System.out.println(x+" "+"is not a palindrome");
		}
}
}

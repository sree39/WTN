package com.wipro.flowcontrolstatements;

public class Loop17 {
public static void main(String[]args)
{
	int num=Integer.parseInt(args[0]);
	int rev=0;
	while(num!=0)
	{
		int r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	System.out.println(rev);
}
}

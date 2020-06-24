package com.wipro.flowcontrolstatements;

public class Loop12 {
public static void main(String[]args)
{
	int n=Integer.parseInt(args[0]);
	int i;
	int flag=0;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;
		}
	}
	if(flag!=1) {
		System.out.println("Prime number");
	}
	else
	{
		System.out.println("Not a Prime number");
	}
}
}

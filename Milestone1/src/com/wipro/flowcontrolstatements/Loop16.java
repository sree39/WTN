package com.wipro.flowcontrolstatements;

public class Loop16 {
public static void main(String[]args)
{
	if(args.length==0)
	{
		System.out.println("Please enter an integer number");
		System.exit(0);
	}
	else
	{
		int i,j;
		int n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
}

package com.wipro.flowcontrolstatements;

public class Loop15 {
	public static void main(String[]args)
	{
		int l=args.length;
		int n=Integer.parseInt(args[0]);
		int i,sum=0,r;
		for(i=1;i<=l;i++)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		
	System.out.println(sum);
		
	}

}

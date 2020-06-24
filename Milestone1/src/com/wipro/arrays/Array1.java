package com.wipro.arrays;

public class Array1 {
	public static void main(String[]args)
	{
		int i,sum=0;
		int l=args.length;
		float avg;
		for(i=0;i<l;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		avg=sum/l;
		System.out.println("sum is:" +sum);
		System.out.println("average is:"+avg);
	}
	}


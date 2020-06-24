package com.wipro.arrays;

public class Middleway {
	public static void main(String[]args)
	{
		int a[]= {7,7,7};
		int b[]= {3,8,0};
		int c[]=new int[2];
		int k=0;
		c[k]=a[a.length/2];
			k++;
		c[k]=b[b.length/2];
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	}



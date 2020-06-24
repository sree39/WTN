package com.wipro.arrays;

public class Array3 {
	public static void main(String[] args)
	{
	int i,c=0;
	int a[]={1,4,34,56,7};
	int k=Integer.parseInt(args[0]);
	for(i=0;i<a.length;i++)
	{
	if(a[i]==k){
	System.out.println("The element present at:"+ (i));
	c=c+1;
	}
	}
	if(c==0)
	System.out.println("-1");
	}
}

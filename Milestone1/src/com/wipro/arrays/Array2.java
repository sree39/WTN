package com.wipro.arrays;

public class Array2 {
public static void main(String[]args)
{
	int[] a;
	a=new int[] {20,23,80,45,10};
	int max=a[0],min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		if(a[i]>max)
		{
			max=a[i];
		}
		}
	System.out.println("minimum element is:"+" "+min);
	System.out.println("maximum element is:"+" "+max);
	
}
}

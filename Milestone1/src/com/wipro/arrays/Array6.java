package com.wipro.arrays;

public class Array6 {
	public static void main(String[]args) {
	int t;
	int a[]= {11,5,7,25,85,12,3};
	int l=a.length;
	for(int i=0;i<l;i++)
	{
		for(int j=i+1;j<l;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		System.out.print(a[i]+" ");
	}
}
}

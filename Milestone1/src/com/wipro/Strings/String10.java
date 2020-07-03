package com.wipro.strings;
import java.util.Scanner;
public class String10 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int l=str.length();
		String s=str.substring(l-n,l);
		for(int i=0;i<n;i++)
		{
			System.out.print(s);
		}
		
	}
}

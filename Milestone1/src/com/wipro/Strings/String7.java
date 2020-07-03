package com.wipro.strings;
import java.util.Scanner;
public class String7 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
			if(str.charAt(0)=='x' && str.charAt(l-1)=='x')
			{
				System.out.println(str.substring(1,l-1));
			}
			else
			{
				System.out.println(str);
			}
		
	}
}

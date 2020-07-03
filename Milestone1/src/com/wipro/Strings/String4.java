package com.wipro.strings;
import java.util.Scanner;
public class String4 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int l=str.length();
	if(l%2==0)
	{
		System.out.println(str.substring(0,l/2));
	}
	else
	{
		System.out.println("null");
	}
	
}
}

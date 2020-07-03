package com.wipro.strings;
import java.util.Scanner;
public class String6 {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	String a=s.next();
	String b=s.next();
	if(a.length()>b.length())
	{
		System.out.println(b+a+b);
	}
	else
	{
		System.out.println(a+b+a);
	}
}
}

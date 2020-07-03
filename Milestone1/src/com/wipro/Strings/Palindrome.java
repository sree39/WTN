package com.wipro.strings;
import java.util.Scanner;
public class Palindrome {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String org=sc.next();
	String rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	if(org.equals(rev))
{
	System.out.println("String is palindrome");
}
	else
	{
		System.out.println("String is not a palindrome");
	}
}
}

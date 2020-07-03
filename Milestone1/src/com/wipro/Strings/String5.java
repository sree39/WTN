package com.wipro.strings;
import java.util.Scanner;
public class String5 {
public String fc(String s)
{
	int l=s.length();
	return (s.substring(1, l-1));
}
public static void main(String[]args)
{
	String5 sa=new String5();
	Scanner sc=new Scanner(System.in);
    String str=sc.next();
    System.out.println(sa.fc(str));
	
}
}

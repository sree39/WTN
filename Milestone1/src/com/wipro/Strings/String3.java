package com.wipro.strings;
import java.util.Scanner;
public class String3 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int l=str.length();
	String sub=str.substring(0,2);
	for(int i=0;i<l;i++){
		System.out.print(sub);
	}
	
}
}

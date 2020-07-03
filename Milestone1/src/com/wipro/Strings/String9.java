package com.wipro.strings;
import java.util.Scanner;
public class String9 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	String c="";
	int l1,l2;
	l1=a.length();
	l2=b.length();
	int co=0;
	if(l1==l2)
	{
		for(int i=0;i<l1;i++)
		{
			c=c+a.charAt(i)+b.charAt(i);
		}
	}
	else if(l1>l2)
	{
		for(int i=0;i<l1&&i<=l2;i++)
		{
			c=c+a.charAt(i)+b.charAt(i);
			co++;
			if(co==l2)
			{
				break;
			}
		}
		c=c+a.substring(co,l1);
	}
	else {
		for(int i=0;i<l2&&i<=l1;i++)
		{
			c=c+a.charAt(i)+b.charAt(i);
			co++;
			if(co==l1)
			{
				break;
			}
		}
		c=c+b.substring(co,l2);
	}
	System.out.println(c);
}
}

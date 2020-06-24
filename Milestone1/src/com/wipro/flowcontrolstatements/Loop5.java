package com.wipro.flowcontrolstatements;

public class Loop5 {
public static void main(String[]args)
{
 char c=args[0].charAt(0);
 if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
 {
	 System.out.println("Alphabhet");
 }
 else if(c>='0'&& c<='9')
 {
	 System.out.println("Digit");
 }
 else
 {
	 System.out.println("'Special Characters");
 }
}
}

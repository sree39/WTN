package com.wipro.strings;
import java.util.Scanner;
public class String2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		a=a.toLowerCase();
		b=b.toLowerCase();
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		
		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			sb.append(b.substring(1,b.length()));
		} else {
			sb.append(b);
		}
		
		System.out.println(sb);		
		
		

}
}

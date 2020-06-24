package com.wipro.flowcontrolstatements;

public class Loop19 {
public static void main(String[] args) {
		
		int n = 0;
		int i = 0;
		
		while (n!= 5) {
			i++;
			
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				n++;		
				}
		}
	}

}

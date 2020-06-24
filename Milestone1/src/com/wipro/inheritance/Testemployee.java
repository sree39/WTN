package com.wipro.inheritance;

public class Testemployee {
public static void main(String[]args) {
	Employee test=new Employee();
    test.setName("sreelekha");
    test.setSal(100000);
	test.setYear(2020);
	test.setInsuranceno("123abc");
	System.out.println("Name of the Employee:"+test.getName());
	System.out.println("Salary of the employee:"+test.getSal());
	System.out.println("Started in the year:"+test.getYear());
	System.out.println("Insurance Number:"+test.getInsuranceno());
	}
}

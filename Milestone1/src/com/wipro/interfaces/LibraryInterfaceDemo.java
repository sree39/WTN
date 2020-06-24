package com.wipro.interfaces;

public class LibraryInterfaceDemo {
public static void main(String[]args)
{
	KidUsers ku=new KidUsers(10,"Kid");
	ku.registerAccount();
	ku.requestBook();
	AdultUser au=new AdultUser(40,"Fiction");
	au.registerAccount();
	au.requestBook();
}
}

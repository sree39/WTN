package com.wipro.flowcontrolstatements;

public class Loop14 {
public static void main(String[]args)
{
	if(args.length==0)
	{
		System.out.println("Please enter an integer number ");
		System.exit(0);
		
	}
	int p=Integer.parseInt(args[0]);
	if(p==0 ||p==1 )
	{
		System.out.println(p+" "+"is neither prime nor composite");
	}
	int i;
	int flag=0;
	if(p>1) {
	for(i=2;i<=p/2;i++)
	{
		if(p%i==0)
		{
			flag=1;
		}
	}
	if(flag!=1) {
		System.out.println(p+" "+"Prime number");
	}
	else
	{
		System.out.println(p+" "+"Not a Prime number");
	}
	}
}
}

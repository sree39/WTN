package com.wipro.flowcontrolstatements;

public class Loop13 {
	public static void main(String[]args)
	{
		for(int n=10;n<99;n++)
		{
			int flag=0;
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			
			}
			if(flag==0)
			{
				System.out.println(n+" ");
			}
		}
	}

}

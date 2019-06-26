package com.covalense.javaapp.example;

public class Star 
{
	static int p(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		return n;
	}

public static void main(String[] args) 
{
	int x=p(5);
}
}
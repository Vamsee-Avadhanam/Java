package com.practice;

import java.util.Scanner;

public class ClassB1 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no rows");
		
		int rows=sc.nextInt();
		
		for(int i=rows;i>=1;i--)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(j+" ");
			}	
		
		System.out.println();
		}
	}
}

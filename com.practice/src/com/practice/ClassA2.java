package com.practice;

import java.util.Scanner;

public class ClassA2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n=sc.nextInt();
		 for (int i=0; i<n; i++) 
		 { 
           for (int j=n-i; j>1; j--) 
		       System.out.print(" "); 
           for (int j=0; j<=i; j++ ) 
		       System.out.print(" *"); 
           System.out.println(); 
		     
		 } 
		 
		}

	}


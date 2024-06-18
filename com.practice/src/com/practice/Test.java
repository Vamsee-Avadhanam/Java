package com.practice;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,22,3,44,56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}

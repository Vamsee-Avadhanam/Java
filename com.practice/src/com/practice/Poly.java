package com.practice;

public class Poly 
{
	public static void main(String[] args)
	{
		int arr[]= {4,7,9,10,1,3,2};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element:" +arr[i]);
				}
				else
					System.out.println("no duplicate");
			}
		}
	}
}

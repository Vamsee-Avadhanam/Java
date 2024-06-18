package com.pack1;

//Finding Duplicate elements in an array
public class ClassA {

	public static void main(String[] args)
	{
		int arr[]= {1,3,4,5,3,5,6,8,6,2};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Duplicate elements :"+arr[i]);
			}
				
		}
	}

}

/*
 * O/P:
 *  Duplicate elements :3
 *  Duplicate elements :5 
 *  Duplicate elements :6
 */


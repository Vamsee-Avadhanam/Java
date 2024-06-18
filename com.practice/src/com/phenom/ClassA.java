package com.phenom;
//Arrays Sorting
public class ClassA
{
		public static void main(String[] args) {
		
		int arr[]= {4,0,9,5,0,4,6,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Duplicate elements : "+arr[i]);
				
			}
		}
		
	}
}


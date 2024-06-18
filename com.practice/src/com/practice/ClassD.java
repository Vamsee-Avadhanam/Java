package com.practice;

public class ClassD 
{
	    public static void main(String[] args) {
	        int rows = 5;
	        int i, j, space = 1;
	        space = rows - 1;
	        for (j = 1; j <= rows; j++) {
	            for (i = 1; i <= space; i++) {
	                System.out.print(" ");
	            }
	            space--;
	            for (i = 1; i <= 2 * j - 1; i++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        space = 1;
	        for (j = 1; j <= rows - 1; j++) {
	            for (i = 1; i <= space; i++) {
	                System.out.print(" ");
	            }
	            space++;
	            for (i = 1; i <= 2 * (rows - j) - 1; i++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	

}

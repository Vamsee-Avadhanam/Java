package com.practice;

public class ClassA 
{	
	void meth1()
	{
		System.out.println("Hello  am ClassA meth1() ");
	}
	void meth2(int x)
	{
		System.out.println("ClassA meth2");
		
	}
	protected void meth3(int x ,String s)
	{
		System.out.println("ClassA meth3");
	}
	static void meth4()
	{
		System.out.println("ClassA meth4");
	}
	ClassA meth5()
	{
		System.out.println("ClassA meth5");
		return new ClassA();
		
	}
	
	
}

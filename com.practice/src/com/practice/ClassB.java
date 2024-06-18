package com.practice;

public class ClassB extends ClassA
{
		void meth1()
		{
			System.out.println("Hello I am ClassB meth1()");
		}
		void meth2(int i)
		{
			System.out.println(20);
		}
		@Override
		public void meth3(int i, String msg)
		{
			System.out.println(30);
		}
		static void meth4()
		{
			System.out.println(40);
		}
		ClassB meth5()
		{
			System.out.println(70);
			return new ClassB();
			
		}
		
		
		public static void main(String[] args) {
			
			ClassA aobj1=new ClassA();
			aobj1.meth5();
			ClassA aobj2=new ClassB();
			aobj2.meth5();
			aobj2.meth4();
			aobj1.meth3(11,"dd");
		}
}

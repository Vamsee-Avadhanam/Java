package com.practice;

public class ClassC  extends Thread
{
	@Override
	public void run()
	
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<=5;i++)
		{
		System.out.println(name+"("+priority+")"+"has executed run() :"+i);
		}
	}	
		
	public static void main(String[] args) throws InterruptedException
	{
		ClassC cobj=new ClassC();
		Thread t1=new Thread(cobj);
	
		Thread t2=new Thread(cobj);
		t1.setName("First_Thread");

		t2.setName("Second_thread");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(10);
		t1.start();
		t1.stop();
		t2.start();
		System.out.println("J");
		t1.sleep(5000);
		System.out.println("A");
		t1.sleep(5000);
		System.out.println("V");
		t1.sleep(5000);
		System.out.println("A");
	}
}

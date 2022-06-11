package com.MultiThraeding;

public class MultiThread extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
}
class MultiThread1 extends Thread
{
	public void run()
	{
		System.out.println("Task 2");
	}	
}
class Main
{
	public static void main(String[] args)
	{
		MultiThread thread=new MultiThread();
		thread.start();
		 
		MultiThread1 thread1=new MultiThread1();
		thread1.start();
	}
}

package com.MultiThraeding;

public class ThreadSetName1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Task hello");
	}
	public static void main(String[] args) 
	{
		ThreadSetName1 t=new ThreadSetName1();
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		ThreadSetName1 t1=new ThreadSetName1();
		t1.start();		
	}
}

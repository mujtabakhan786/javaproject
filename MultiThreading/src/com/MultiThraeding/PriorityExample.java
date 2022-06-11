package com.MultiThraeding;

public class PriorityExample extends Thread 
{
	public void run()
	{
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("child tread");
	}
	public static void main(String[] args)
	{
		PriorityExample p=new PriorityExample();
		p.start();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("main thread");
	}
}

package com.MultiThraeding;

public class ThreadSetName 
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		//Thread.currentThread().setName();
		System.out.println(Thread.currentThread().getName());
	}
}

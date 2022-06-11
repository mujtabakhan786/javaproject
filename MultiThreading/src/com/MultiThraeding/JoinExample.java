package com.MultiThraeding;

public class JoinExample extends Thread
{
	 static Thread mainthread;
	public void run()
	{
		
		try
		{
			mainthread.join();
			for(int i=1;i<=5;i++)
			{
			System.out.println("chlid thread : "+i);
			Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		mainthread=Thread.currentThread();
		JoinExample j=new JoinExample();
		j.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread : "+i);
		}
	}
}

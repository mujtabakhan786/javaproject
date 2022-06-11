package com.MultiThraeding;

public class DaemonExample extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread");
		}
		else
		{
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) 
	{
		DaemonExample d=new DaemonExample();
		d.setDaemon(true);
		d.start();
		System.out.println("main thread");
	}

}

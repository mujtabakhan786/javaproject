package com.MultiThraeding;

public class SleepExample extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println(i+" : "+ Thread.currentThread().getName() );
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		SleepExample s=new SleepExample();
		SleepExample s1=new SleepExample();
		s.start();
		s1.start();

	}

}

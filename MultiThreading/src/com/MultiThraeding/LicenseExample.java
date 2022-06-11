package com.MultiThraeding;

class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Medical starts");
			Thread.sleep(1000);
			System.out.println("Medical completed");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
class TestDriver extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Test Drive starts");
			Thread.sleep(3000);
			System.out.println("Test Drive is completed");
		} 
		catch (Exception e) {
			
		}
	}
}
class OfficerSign extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Officer take the files");
			Thread.sleep(7000);
			System.out.println("Officer works complete");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
public class LicenseExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		Medical md=new Medical();
		md.start();
		md.join();
		
		TestDriver td=new TestDriver();
		td.start();
		td.join();
		
		OfficerSign os=new OfficerSign();
		os.start();
		os.join();
		
	}

}

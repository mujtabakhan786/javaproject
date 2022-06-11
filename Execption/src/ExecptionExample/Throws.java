package ExecptionExample;

import java.io.IOException;

public class Throws
{
	void m() throws IOException
	{
		throw new IOException("device error");
	}

}
class TestThrows
{
	public static void main(String[] args) 
	{
		Throws t=new Throws();
		try 
		{
			t.m();	
		} catch (Exception e) 
		{
			System.out.println("exception handle");
		}
		System.out.println("normal flow");
		
	}
}
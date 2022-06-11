package ExecptionExample;

public class UnderAgeException1 extends RuntimeException
{
	UnderAgeException1()
	{
		super("You are not eligible for vote");
	}
	UnderAgeException1(String message)
	{
		super(message);
	}
}
class Voting1
{
	public static void main(String[] args) 
	{
		int age=15;
		try
		{
			if (age<18) 
			{
				throw new UnderAgeException1();
			}
			else 
			{
				System.out.println("you are eligible for vote");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
				System.out.println("Hello");
	}

}

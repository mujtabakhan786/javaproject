package ExecptionExample;

public class UnderAgeExecption extends Exception
{
	UnderAgeExecption()
	{
		super("You are not eligible for vote");
	}
	UnderAgeExecption(String message)
	{
		super(message);
	}
}
class voting
{
	public static void main(String[] args) 
	{
		int age=15;
		try
		{
			if (age<18) 
			{
				throw new UnderAgeExecption();
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
	}
}

package ExecptionExample;

public class ThrowExample 
{
	public static void main(String[] args) 
	{
		int age=16;
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible to vote");
		}
		else 
		{
			System.out.println("Please vote");
		}
	}

}

package ExecptionExample;

public class Finally {
	public static void main(String[] args) {
		try 
		{
			int a=100,b=0,c;
			c=a/b;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("rest of the code");
		}

		
		finally 
		{
			System.out.println("i am in finally block");
		}

		System.out.println("rest of the code");
	}

}

package ExecptionExample;

public class ExecptionProgram {
	public static void main(String[] args) {
		try 
		{
			int a=100,b=0,c;
			c=a/b;
		} 
		catch (ArithmeticException e) 
		{
			//e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}

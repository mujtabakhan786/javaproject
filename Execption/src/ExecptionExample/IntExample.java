package ExecptionExample;

class IntExample
{
   String m1()
	{
		System.out.println("i am in mujtaba");
		return "";
	}
}	
class IntExample1 extends IntExample
{
	char m2()
	{
		System.out.println("i am in azhar push ");
		return 0;
	}
	
	public static void main(String[] args)
	{
		IntExample1 i=new IntExample1();
		i.m1();
		i.m2();
	}
}
	
	
	

	



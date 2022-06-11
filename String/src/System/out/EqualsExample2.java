package System.out;

public class EqualsExample2 {
public static void main(String[] args) {
	String s="a";
	String s1="123";
	String s2="45.89";
	String s3="false";
	Character c=new Character('a');
	Integer i=new Integer(123);
	Float f=new Float(45.89);
	Boolean b=new Boolean(false);
	System.out.println(s.equals(c));
	System.out.println(s1.equals(i));
	System.out.println(s2.equals(f));
	System.out.println(s3.equals(b));
	System.out.println(s.equals(c.toString()));
	System.out.println(s1.equals(i.toString()));
	System.out.println(s3.equals(b.toString()));
	
}
}

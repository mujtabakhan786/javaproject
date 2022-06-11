package ExecptionExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite 

{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException
	{
		String s="Khan";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
	
}
class Test
{
	public static void main(String[] args) 
	{
		ReadAndWrite rw=new ReadAndWrite();
		try 
		{
			rw.readFile();
		} 
		catch (Exception e)
		{
		  System.out.println("file not found in readfile");
		}
		try 
		{
			rw.saveFile();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		System.out.println("file not found in savefile");
		
		 
		
			
	}
}

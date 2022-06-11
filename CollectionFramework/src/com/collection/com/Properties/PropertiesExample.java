package com.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("src/com/collection/com/Properties/Abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("mujtaba");
		System.out.println(s);
		p.setProperty("mujtaba", "456");
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("src/com/collection/com/Properties/Abc.properties");
		p.store(fos, "Updated by Mujtaba");
		
	}
}

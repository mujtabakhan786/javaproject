package com.pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st=new Student();
        st.setId(101);
        st.setName("Mujtaba");
        st.setCity("Mumbai");
        
        Address ad=new Address();
        ad.setStreet("Street1");
        ad.setCity("Mumbai");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(171.171);
        
        FileInputStream fis=new FileInputStream("src/main/java/img1.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(st);
        System.out.println(ad);
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(st);
        session.save(ad);
        transaction.commit();
        session.close();
    }
}

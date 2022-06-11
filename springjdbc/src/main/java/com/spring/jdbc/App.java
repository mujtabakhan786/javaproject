package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My project is started......" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        JdbcTemplate template=(JdbcTemplate) context.getBean("jdbctemplate");
        
//        //insert query
//        String q="insert into student(id,name,city) values(?,?,?)";
//        
//        //fire query
//        int i = template.update(q,103,"Faisal","Dehli");
//        System.out.println("number of record inserted.." + i);
        
        StudentDao studentDao = (StudentDao) context.getBean("studentdao");
        
//        Student student=new Student();
//        student.setId(105);
//        student.setName("Khan");
//        student.setCity("Lucknow");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student added " + result);
        
        
//        Student student=new Student();
//        student.setId(104);
//        student.setName("Murtaza");
//        student.setCity("Mumbai");
//        int change = studentDao.change(student);
//        System.out.println(change);
        
//        Student student=new Student();
//        student.setId(105);
//        
//        
//        int i = studentDao.delete(student);
//        System.out.println(i);
        
//        Student student = studentDao.getStudent(101);
//        System.out.println(student);
        
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student s:allStudents)
        {
        	System.out.println(s);
        }
    }
}
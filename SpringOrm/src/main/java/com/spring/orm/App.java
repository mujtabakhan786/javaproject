package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao sd = (StudentDao) context.getBean("studentDao");
//        Student s=new Student(107,"Razzque","Powai");
//        int insert = sd.insert(s);
//        System.out.println(insert);

////        Student s=new Student();
//        Student student = sd.getStudent(107);
//        System.out.println(student);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for add new student");
			System.out.println("Press 2 for display all student");
			System.out.println("Press 3 for get details of single student");
			System.out.println("Press 4 for delete student");
			System.out.println("Press 5 for update student");
			System.out.println("Press 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					
					System.out.println("Enter user id :");
					int uId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name :");
					String uName = br.readLine();
					
					System.out.println("Enter user city :");
					String uCity = br.readLine();
					
					Student s=new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					
					int insert = sd.insert(s);
					System.out.println(insert + "student added");
					System.out.println("***********************");
					break;
				case 2:
					List<Student> allStudents = sd.getAllStudents();
					for(Student s1:allStudents)
					{
						System.out.println("Id :" + s1.getStudentId());
						System.out.println("Name :" + s1.getStudentName());
						System.out.println("City :" + s1.getStudentCity());
						System.out.println("---------------------------");
					}
					break;
				case 3:
					System.out.println("Enter user id :");
					int uerid = Integer.parseInt(br.readLine());
					Student student = sd.getStudent(uerid);
					System.out.println("Id :" + student.getStudentId());
					System.out.println("Name :" + student.getStudentName());
					System.out.println("City :" + student.getStudentCity());
					System.out.println("------------------------------");
					break;
				case 4:
					System.out.println("Enter user id :");
					int id = Integer.parseInt(br.readLine());
					sd.deleteStudent(id);
					System.out.println(id);
					break;
				case 5:
					System.out.println("Enter user id :");
					int uId1 = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name :");
					String uName1 = br.readLine();
					
					System.out.println("Enter user city :");
					String uCity1 = br.readLine();
					
					Student s1=new Student();
					s1.setStudentId(uId1);
					s1.setStudentName(uName1);
					s1.setStudentCity(uCity1);
					
					sd.updateStudent(s1);
					System.out.println("Updated Student :" + s1);
					System.out.println("----------------------------");
					break;
				case 6:
					go = false;
					break;
				}
			} catch (IOException e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thankyou using my Application");
	}
}

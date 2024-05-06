package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dependency injection example:\n");

        // Load the Spring configuration file
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.core.config.xml");

        // Retrieve the Student bean from the context
        Student student= (Student) context.getBean("studentConstructor");
//        Student student= (Student) context.getBean("studentField");
//        Student student= (Student) context.getBean("studentSetter");

//        AddressService student= (AddressService) context.getBean("addressInterface");
//        System.out.println("Address: "+student.getAddress());

        // Display information about the student
        System.out.println("Student Details:");
        System.out.println("SID: " + student.getSid());
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Address: "+student.getAddress());
        System.out.println("Hobbies: " + student.getHobbies());
        System.out.println("Grades: " + student.getGrades());
        System.out.println("Friend: "+ student.getFriend());
    }
}
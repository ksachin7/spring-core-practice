package org.example;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.example.interfaces.Employee;
import org.example.services.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//      ------ creating object using constructor ------
        Vehicle vehicle= new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle name without spring context: "+ vehicle.getName());


//      ------------- using spring context -------------

        /* The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        */
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle vehicle1= context.getBean(Vehicle.class);   // this will throw NoUniqueBeanDefinitionException exception if multiple Bean with same type would be there
        Vehicle vehicle1= context.getBean("vehicle1",Vehicle.class);    // specify Bean name to avoid NoUniqueBeanDefinitionException
        System.out.println("Vehicle name from Spring Context: "+vehicle1.getName());
//      ----------------------------------------------------------------------------------
        /**
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        */
        String hello= context.getBean(String.class);    // this will throw NoUniqueBeanDefinitionException exception if multiple methods with String would be there and @primary is not used
        System.out.println("String value from spring context: "+hello);

//        String hello= (String) context.getBean("hello");
//        System.out.println("String value from spring context: "+hello);

        String bye= context.getBean("bye",String.class);
        System.out.println("String value from spring context: "+bye);

        Integer num= context.getBean(Integer.class);
        System.out.println("Integer value from spring context: "+ num);
//      ----------------------------------------------------------------------------------

        // using @Component scan and setting values here
        Person person1= context.getBean("person", Person.class);
        person1.setName("John");
        person1.setAge(30);
        person1.setVehicle(vehicle1);

        Person person2 = context.getBean("person2",Person.class);
        person2.setName("Lucy");
        person2.setAge(21);

        // Set spouses for each other (creating circular dependency)
        person1.setSpouse(person2);

        // Display the information
        System.out.println("\n"+person1);

        // representing @Qualifier annotation
        EmployeeService employeeService= context.getBean(EmployeeService.class);
        employeeService.manageEmployee();

        // Close the context
        context.close();
    }
}
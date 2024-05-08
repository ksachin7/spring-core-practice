package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //---------------- Dependency Injection using java configurations ----------------
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Register the SpringConfig class itself
//        context.register(SpringConfig.class);

        // Refresh the context to apply the bean registrations
//        context.refresh();

        // Create instances of required beans with desired values
//         Retrieve necessary beans from the context
        AddressService addressService = context.getBean(AddressServiceImpl.class);
         ((AddressServiceImpl) addressService).setCity("New York");
        ((AddressServiceImpl) addressService).setStreet("Broadway");

        // Create sample data for courses
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Mathematics"));
        courses.add(new Course(2, "Physics"));
//        System.out.println(courses);

        // Create sample data for hobbies
        Set<String> hobbies = new HashSet<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");

        // Create sample data for grades
        Map<String, Grade> grades = new HashMap<>();
        grades.put("Math", new Grade("Math", "A"));
        grades.put("Physics", new Grade("Physics", "B"));
//        AddressService addressService = new AddressServiceImpl("New York", "Broadway");
//        Map<String, Grade> grades = new LinkedHashMap<>();
//        grades.put("math", new Grade("math", "A"));
//        grades.put("science", new Grade("science", "B+"));
//        List<Course> courses = Arrays.asList(
//                new Course(01, "Java"),
//                new Course(02, "Spring Framework")
//        );
//        Set<String> hobbies = new HashSet<>(Arrays.asList("Reading", "Coding", "Singing"));
        Friend friend = new Friend(1, "Alice");

        // Register beans with the application context
        context.registerBean("addressService", AddressService.class, () -> addressService);
        context.registerBean("grades", Map.class, () -> grades);
        context.registerBean("courses", List.class, () -> courses);
        context.registerBean("hobbies", Set.class, () -> hobbies);
        context.registerBean("friend", Friend.class, () -> friend);

        // Retrieve the Student bean from the context
        Student student1 = context.getBean(Student.class);
        student1.setSid(001);
        student1.setStudentName("John Doe");

        // Display information about the student
        System.out.println("----- Dependency injection using java config: -----");
        System.out.println("Student Details: " + student1.getClass().getName());
        System.out.println(student1);

//        ------------------------
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        // Retrieve necessary beans from the context
//        AddressService addressService = context.getBean(AddressServiceImpl.class);
//        ((AddressServiceImpl) addressService).setCity("New York");
//        ((AddressServiceImpl) addressService).setStreet("Broadway");
//
//        // Create sample data for courses
//        List<Course> courses = new ArrayList<>();
//        courses.add(new Course(1, "Mathematics"));
//        courses.add(new Course(2, "Physics"));
//
//        // Create sample data for hobbies
//        Set<String> hobbies = new HashSet<>();
//        hobbies.add("Reading");
//        hobbies.add("Swimming");
//
//        // Create sample data for grades
//        Map<String, Grade> grades = new HashMap<>();
//        grades.put("Math", new Grade("Math", "A"));
//        grades.put("Physics", new Grade("Physics", "B"));
//
//        // Create sample data for friend
//        Friend friend = new Friend(1, "Alice");
//
//        // Create Student object manually and set properties
//        Student student = new Student();
//        student.setSid(1);
//        student.setStudentName("John Doe");
//        student.setAddressService(addressService);
//        student.setCourses(courses);
//        student.setHobbies(hobbies);
//        student.setGrades(grades);
//        student.setFriend(friend);
//
//        // Display student info
//        System.out.println(student);
        // Don't forget to close the context to release resources
        context.close();

        //----------------- Dependency Injection using xml configurations -----------------

        // Load the Spring configuration file
        ApplicationContext xmlContext= new ClassPathXmlApplicationContext("spring.core.config.xml");

        // Retrieve the Student bean from the context
//        Student student2= (Student) xmlContext.getBean("studentConstructorInjection");
//        Student student2= (Student) xmlContext.getBean("studentSetterInjection");
        Student student2= xmlContext.getBean("autowiringStudent", Student.class);

//        AddressService student2= (AddressService) xmlContext.getBean("addressInterfaceInjection");
//        System.out.println("Address: "+student.getAddress());

        // Display information about the student
        System.out.println("\n----- Dependency injection using xml config: -----");

        System.out.println("Student Details: "+student2.getClass().getName());
        System.out.println("SID: " + student2.getSid());
        System.out.println("Name: " + student2.getStudentName());
        System.out.println("Address: "+student2.getAddress());
        System.out.println("Hobbies: " + student2.getHobbies());
        System.out.println("Grades: " + student2.getGrades());
        System.out.println("Friend: "+ student2.getFriend());

//        xmlContext.close();
    }
}
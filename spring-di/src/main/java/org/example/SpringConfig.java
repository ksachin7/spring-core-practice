package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {
//        @Bean
//        public AddressService addressService() {
//            AddressServiceImpl addressService = new AddressServiceImpl();
//            addressService.setCity("New York");
//            addressService.setStreet("Broadway");
//            return addressService;
//        }
//
//        @Bean
//        public Map<String, Grade> grades() {
//            Map<String, Grade> grades = new LinkedHashMap<>();
//            grades.put("math", mathGrade());
//            grades.put("science", scienceGrade());
//            return grades;
//        }
//
//        @Bean
//        public Grade mathGrade() {
//            Grade grade = new Grade();
//            grade.setSubject("math");
//            grade.setGrade("A");
//            return grade;
//        }
//
//        @Bean
//        public Grade scienceGrade() {
//            Grade grade = new Grade();
//            grade.setSubject("science");
//            grade.setGrade("B+");
//            return grade;
//        }
//
//        @Bean
//        public List<Course> courses() {
//            List<Course> courses = new ArrayList<>();
//            courses.add(javaCourse());
//            courses.add(springCourse());
//            return courses;
//        }
//
//        @Bean
//        public Course javaCourse() {
//            Course course = new Course();
//            course.setCourseId(01);
//            course.setCourseName("Java");
//            return course;
//        }
//
//        @Bean
//        public Course springCourse() {
//            Course course = new Course();
//            course.setCourseId(02);
//            course.setCourseName("Spring Framework");
//            return course;
//        }
//
//        @Bean
//        public Set<String> hobbies() {
//            Set<String> hobbies = new HashSet<>();
//            hobbies.add("Reading");
//            hobbies.add("Coding");
//            hobbies.add("Singing");
//            return hobbies;
//        }
//
//        @Bean
//        public Friend friend() {
//            Friend friend = new Friend();
//            friend.setFid(001);
//            friend.setName("Alice");
//            return friend;
//        }
//
////        @Bean
////        public Student studentConstructorInjection(@Qualifier("addressService") AddressService addressService,
////                                                   List<Course> courses,
////                                                   Set<String> hobbies,
////                                                   Map<String, Grade> grades,
////                                                   Friend friend) {
////            return new Student(1, "Alice", addressService, courses, hobbies, grades, friend);
////        }
//
//        @Bean
//        public Student studentSetterInjection(@Qualifier("addressService") AddressService addressService,
//                                              List<Course> courses,
//                                              Set<String> hobbies,
//                                              Map<String, Grade> grades,
//                                              Friend friend) {
//            Student student = new Student();
//            student.setSid(2);
//            student.setStudentName("Alice");
//            student.setAddressService(addressService);
//            student.setCourses(courses);
//            student.setHobbies(hobbies);
//            student.setGrades(grades);
//            student.setFriend(friend);
//            return student;
//        }
//
//        @Bean
//        public AddressService addressInterfaceInjection() {
//            return new AddressServiceImpl("New York", "Broadway");
//        }

}

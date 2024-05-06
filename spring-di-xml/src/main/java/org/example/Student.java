package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class Student {
    private int sid;
    private String studentName;

    // Field injection
    @Autowired
    private AddressService address;

    private List<Course> courses;       // Collection List injection
    private Set<String> hobbies;        // Collection Set injection
    private Map<String, Grade> grades;  // Collection Map injection
    private Student friend;             // Reference type injection

    public Student() {
    }

    public Student(int sid, String studentName, AddressService address, List<Course> courses, Set<String> hobbies, Map<String, Grade> grades, Student friend) {
        this.sid = sid;
        this.studentName = studentName;
        this.address = address;
        this.courses = courses;
        this.hobbies = hobbies;
        this.grades = grades;
        this.friend = friend;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public AddressService getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(AddressService address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student getFriend() {
        return friend;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Grade> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Grade> grades) {
        this.grades = grades;
    }

    public void setFriend(Student friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                ", hobbies=" + hobbies +
                ", grades=" + grades +
                ", friend=" + friend +
                '}';
    }
}

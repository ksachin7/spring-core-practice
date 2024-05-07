package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class Student {
    private int sid;
    private String studentName;
    private AddressService addressService;

    private List<Course> courses;       // Collection List injection
    private Set<String> hobbies;        // Collection Set injection
    private Map<String, Grade> grades;  // Collection Map injection
    private Friend friend;             // Reference type injection

    public Student() {
    }

    public Student(int sid, String studentName, AddressService addressService, List<Course> courses, Set<String> hobbies, Map<String, Grade> grades, Friend friend) {
        this.sid = sid;
        this.studentName = studentName;
        this.addressService = addressService;
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

    public AddressService getAddressService() {
        return addressService;
    }

    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    public String getAddress() {
        return addressService.getAddress();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
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

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", studentName='" + studentName + '\'' +
                ", address=" + getAddress() +
                ", courses=" + courses +
                ", hobbies=" + hobbies +
                ", grades=" + grades +
                ", friend=" + friend +
                '}';
    }
}

package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;

    /** In this example, each Person object has a reference to another Person object as their spouse.
     *  This creates a circular dependency because Spring will attempt to resolve these dependencies during bean initialization, causing a deadlock situation.
     *  To resolve this circular dependency, you can use setter injection or @Lazy annotation to break the circular reference.
     */
     @Autowired
     @Lazy
    private Person spouse;

    @Autowired
    private Vehicle vehicle;

//    @Autowired(required = false)
    public Person(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getSpouse() {
        return spouse;
    }

//    @Autowired
//    @Lazy
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spouse=" + (spouse != null ? spouse.getName() : "None") +
                ", vehicle=" + vehicle +
                '}';
    }
}

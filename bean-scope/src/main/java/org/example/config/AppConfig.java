package org.example.config;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.services", "org.example.implementation"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
public class AppConfig {
}

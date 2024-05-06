package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
**/
@Configuration
public class ProjectConfig {

    /**
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned value to the context.
    */
    @Bean
    Vehicle vehicle(){
        var veh= new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Primary
    @Bean(value = "hello")
    String hello() {
        return "Hello World";
    }

    @Bean(name="bye")
    String bye(){
        return "bye!";
    }

    @Bean("number")
    Integer number() {
        return 16;
    }
}

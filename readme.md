# Spring-Core practices

## Tools and Technologies used
**Spring Framework:** Version 6	
**Build tool:** Maven	
**Java:** Version 17	
**IDE:** IntelliJ Idea	

## Project Descriptions
**Project Name:** basics

This project contains practice of various things including:
- Using Spring Context
- Creating beans using annotations such as @Bean, @Component, @Configuration
- used @Qualifier, @Primary, and parameter-name to set priority
- Utilizing ComponentScan and @Autowired for bean discovery and dependency injection
- Fetching a bean from context
- Handling NoUniqueBeanDefinitionException
- Providing custom name to a bean, 
- Practiced circular dependency

---

**Project Name:** lifecyle-methods	

- This is a Java application that utilizes Spring Framework to manage a database connection using JDBC. 
- This project demonstrates the usage of Spring's lifecycle annotations (`@PostConstruct` and `@PreDestroy`) to handle the initialization and cleanup of resources. 

---

**Project Name:** spring-di

This project demonstrates various types of Dependency Injection (DI) in a Spring application using XML and java configurations. Dependency Injection is a design pattern used to inject dependencies into a class, promoting loose coupling and easier testing.

**Ways of injecting dependencies**
- Xml configurations
- Java configurations

**Types of DI**
- Constructor Injection: Dependencies are injected through the class constructor.
- Setter Injection: Dependencies are injected through setter methods.

**Ways of autowiring**
- Field Injection: Dependencies are injected directly into fields of a class.
<!-- - Interface Injection: Dependencies are injected through an interface implemented by the class. -->
- Autowiring: Dependencies are automatically injected by Spring based on specific rules or annotations.

>Annotations used in Student class and others is for DI using annotation & java configurations only not for DI using xml configurations. <u>This is a practice project and I wanted to practice all types of injection in the same Student class to get a better idea of how things work.</u>

**Note:** Autowired annotation on variable/setters is equivalent to autowire="byType" and Autowired annotation on Constructor is equivalent to autowire="constructor".

**Note:** It's important to note that field injection is generally considered less preferable than constructor injection or setter injection due to potential issues with testability, encapsulation, and readability. It's often recommended to favor constructor injection or setter injection over field injection whenever possible.

```java
spring-di
.
├── pom.xml
├── src
│ ├── main
│ │ ├── java
│ │ │ └── org
│ │ │     └── example
│ │ │         ├── AddressService.java
│ │ │         ├── AddressServiceImpl.java
│ │ │         ├── Course.java
│ │ │         ├── Friend.java
│ │ │         ├── Grade.java
│ │ │         ├── Main.java
│ │ │         ├── SpringConfig.java
│ │ │         └── Student.java
│ │ └── resources
│ │     └── spring.core.config.xml
│ └── test
│     └── java
└── target
    ├── classes
    └── generated-sources
        └── annotations
  
```

---

**Project Name:** beans-scope


---

**Project Name:** spring-aop


---
<!-- 
**Project Name:** udemy-assignments

- This project contains assignments done for udemy-springboot course.
- assignment-1:

---
 -->
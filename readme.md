# Spring-Core practices

## Tools and Technologies used
**Spring Framework:** Version 6	
**Build tool:** Maven	
**Java:** Version 17	
**IDE:** IntelliJ Idea	

## Project Descriptions
**Project Name:** basics

Contains basic practice of 
- Using Spring Context
- Creating beans using annotations such as @Bean, @Component, @Configuration, and @Primary
- Utilizing ComponentScan and @Autowired for bean discovery and dependency injection
- Fetching a bean from context
- Handling NoUniqueBeanDefinitionException
- Providing custom name to a bean, etc.

---

**Project Name:** lifecyle-methods	

The Database Connection Manager is a Java application that utilizes Spring Framework to manage a database connection using JDBC. 
This project demonstrates the usage of Spring's lifecycle annotations (`@PostConstruct` and `@PreDestroy`) to handle the initialization and cleanup of resources. 

---

**Project Name:** spring-di

This project demonstrates various types of Dependency Injection (DI) in a Spring application using XML and java configurations. Dependency Injection is a design pattern used to inject dependencies into a class, promoting loose coupling and easier testing.

**Types of DI**
- Constructor Injection: Dependencies are injected through the class constructor.
- Setter Injection: Dependencies are injected through setter methods.
- Field Injection: Dependencies are injected directly into fields of a class.
- Interface Injection: Dependencies are injected through an interface implemented by the class.
- Autowiring: Dependencies are automatically injected by Spring based on specific rules or annotations.

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

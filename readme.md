# Spring-Core practices

## Tools and Technologies used
**Spring Framework:** Version 6	
**Build tool:** Maven	
**Java:** Version 17	
**IDE:** IntelliJ Idea	

## Project Descriptions
**Project Name:** basics

Contains basic practice of using SpringContext, creating a bean, fetching a bean from context, etc.

---

**Project Name:** 

---

**Project Name:** lifecyle-methods	

The Database Connection Manager is a Java application that utilizes Spring Framework to manage a database connection using JDBC. 
This project demonstrates the usage of Spring's lifecycle annotations (`@PostConstruct` and `@PreDestroy`) to handle the initialization and cleanup of resources. 

---

**Project Name:** spring-di

This project demonstrates various types of Dependency Injection (DI) in a Spring application. Dependency Injection is a design pattern used to inject dependencies into a class, promoting loose coupling and easier testing.

**Types of DI**
- Constructor Injection: Dependencies are injected through the class constructor.
- Setter Injection: Dependencies are injected through setter methods.
- Field Injection: Dependencies are injected directly into fields of a class.

**Bean Registration:** Beans are registered in the Spring IoC container using Java configuration.

```java
spring-di-demo
│
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   ├── AppConfig.java
│                   ├── App.java
│                   ├── Service.java
│                   ├── ServiceImpl.java
│                   ├── ConstructorInjectedController.java
│                   ├── SetterInjectedController.java
│                   └── FieldInjectedController.java
│
└── pom.xml
```

---

**Project Name:** spring-di-xml



```java
spring-di-xml
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
│ │ │         ├── Grade.java
│ │ │         ├── Main.java
│ │ │         └── Student.java
│ │ └── resources
│ │     └── spring.core.config.xml
│ └── test
│     └── java
└── target
    ├── classes
  
```

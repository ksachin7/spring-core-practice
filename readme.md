# Spring-Core practices

## Tools and Technologies
**Spring Framework:** Version 6	
**Build tool:** Maven	
**Java:** Version 17	
**IDE:** IntelliJ Idea	

## Project Descriptions
**Project Name:** basics

This project contains practice of various things including:
- Using Spring Context
- Creating beans using annotations such as @Bean, @Component, @Configuration
- Providing custom name to a bean by @Bean annotation
- Used @Qualifier to disambiguated beans
- Handling NoUniqueBeanDefinitionException with @Primary
- Utilizing ComponentScan and @Autowired for bean discovery and dependency injection
- Fetching a bean from context
- Practiced circular dependency

---

**Project Name:** lifecyle-methods	

- This is a Java application that utilizes Spring Framework to manage a database connection using JDBC. 
- This project demonstrates the usage of Spring's lifecycle annotations (`@PostConstruct` and `@PreDestroy`) to handle the initialization and cleanup of resources. 

---

**Project Name:** spring-di

This project serves as a comprehensive guide to Dependency Injection (DI) within a Spring application, showcasing different implementation approaches through XML and Java configurations. 

**Ways of injecting dependencies:**
- **XML configurations:** Dependencies are defined and wired in XML files, allowing for a clear separation of concerns between configuration and code.
- **Java configurations:** Dependencies are configured programmatically using Java classes, offering flexibility and type safety.
- **Annotation-based:** Dependencies are declared using annotations like `@Autowired`, simplifying configuration and reducing boilerplate code.

**Types of DI:**
- **Constructor Injection:** Dependencies are provided through a class constructor, ensuring that all required dependencies are available when an object is created.
- **Setter Injection:** Dependencies are injected via setter methods, enabling more flexibility in changing dependencies at runtime without altering the constructor signature.
<!-- - **Interface Injection:** Dependencies are injected through an interface implemented by the class, though this approach is less common in Spring due to its reliance on runtime reflection. -->

**Ways of autowiring:**
Dependencies can be automatically wired by Spring based on predefined rules or annotations, reducing manual configuration efforts.
- **Using method parameter:** Dependencies are resolved based on method parameters, with Spring injecting appropriate beans.
- **Using method call:** Beans are instantiated and wired with method calls, often used in conjunction with method parameter autowiring.
- **@Autowired annotation:**
    - **Field Injection:** Dependencies are directly injected into fields of a class, offering simplicity but potentially sacrificing encapsulation.
    - **Constructor Injection:** Dependencies are injected via the constructor, promoting immutable objects and enhancing testability.
    - **Setter Injection:** Dependencies are set using setter methods, allowing for optional dependencies and easier modification post-construction.

**@ComponentScan:** Spring scans the specified packages for components and automatically registers them as beans, reducing manual bean registration overhead.

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

"beans-scope" is a project focusing on the fundamental aspects of Spring beans within the Spring framework. It covers essential concepts such as bean scopes (singleton and prototype), lazy vs. eager initialization, thread safety, etc.

- Practiced Singleton & Prototype bean scope
- Practiced Eager Initialization & Lazy Initialization

---

**Project Name:** spring-aop

This project aims to demonstrate a thorough implementation of Aspect-Oriented Programming (AOP) in a Spring application, focusing on logging as a cross-cutting concern. By leveraging various AOP annotations such as `@Before`, `@After`, `@Around`, `@AfterReturning`, and `@AfterThrowing`, as well as creating a custom annotation @LogExecutionTime, the project provides a comprehensive approach to managing method execution logging.

- Brief explanation of key AOP annotations (`@Before`, `@After`, `@Around`, `@AfterReturning`, `@AfterThrowing`) and their roles in intercepting method execution.
- Creation of a custom annotation @LogExecutionTime to mark methods for logging their execution time.
- Explanation of how to use the custom annotation to apply logging aspect selectively.
- Integration of logging framework (e.g., Java Util Logging or Log4j) to write concise method execution information.

---
<!-- 
**Project Name:** udemy-assignments

- This project contains assignments done for udemy-springboot course.
- assignment-1:

---
 -->
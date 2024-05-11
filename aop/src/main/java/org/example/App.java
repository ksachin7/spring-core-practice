package org.example;

import org.example.config.ProjectConfig;
import org.example.implementations.BookServiceImpl;
import org.example.services.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Spring AOP Project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Set logging level for Spring to FINE
//        Logger logger = Logger.getLogger("org.springframework");
//        logger.setLevel(Level.FINE);

        ApplicationContext ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        BookService bookService= ctx.getBean(BookService.class);

//        bookService.addBook("Pride and Prejudice", "Jane Austen");
//        bookService.addBook("The Catcher in the Rye", "J.D. Salinger");

        bookService.addBook("To Kill a Mockingbird", "Harper Lee");
        bookService.removeBook("To Kill a Mockingbird");

        /*
         * The removeBook() method throws a RuntimeException with the message "Book title is null!" due to an empty title being passed.
         * The @AfterThrowing advice intercepts this exception, logs the details, but does not prevent the exception from propagating further up the call stack.
         * Eventually, the exception reaches the main method, where it's caught and printed as part of the stack trace
         */
        bookService.removeBook("");
        bookService.findBook("1984");

    }
}

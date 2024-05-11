package org.example.implementations;

import org.example.annotations.LogExecutionTime;
import org.example.services.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
//    @LogExecutionTime
    @Override
    public void addBook(String title, String author) {
        System.out.println("Adding book: " + title + " by " + author);
    }

    @Override
    public void removeBook(String title) {
        if(title.isEmpty()) {
            System.out.println("Removing book: " + title);
        }else {
            throw new IllegalArgumentException("Book title is null!");
        }
    }

    @Override
    public String findBook(String title) {
        System.out.println("Finding book: " + title);
        return "Book found: " + title;
    }
}

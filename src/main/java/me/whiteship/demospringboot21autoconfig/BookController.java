package me.whiteship.demospringboot21autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    public Book book() {
        bookRepository.findAll().forEach(System.out::println);
        Book book = bookRepository.findByIsbn("12123");
        return book;
    }
}

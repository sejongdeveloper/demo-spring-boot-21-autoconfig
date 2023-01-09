package me.whiteship.demospringboot21autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @PostConstruct
    public void init() {
        Book book = new Book();
        book.setIsbn("12123");
        book.setTitle("스프링 부트 업데이트");
        book.setPublished(LocalDate.of(2020, 10, 15));
        bookRepository.save(book);
    }
}

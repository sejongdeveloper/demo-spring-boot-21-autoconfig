package me.whiteship.demospringboot21autoconfig;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Async
    public void hello() {
        System.out.println("hello " + Thread.currentThread().getName());
    }

    @Scheduled(fixedDelay = 1_000 * 2)
    public void hi() {
        System.out.println("hi " + Thread.currentThread().getName());
    }
}

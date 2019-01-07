package com.hellokoding.jpa.composite_primary_key;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
class Application implements CommandLineRunner {
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) {
        bookRepository.save(BookEntity.builder()
            .name("Hello Koding")
            .publishedDate(new Date())
            .build());

        log.info("My books: " + bookRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

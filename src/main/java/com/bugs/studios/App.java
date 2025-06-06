package com.bugs.studios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        SpringApplication.run(App.class);

    }
}

@RestController
class MyController{

    @GetMapping
    public String index(){
        return "Hello from the book store";
    }

}

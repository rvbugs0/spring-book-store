package com.bugs.studios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Hello world!
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.bugs.studios","org.ravi"})
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class);
    }
}

@Controller
class MyController{

    @Autowired
    Car car;


    @RequestMapping(path = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Hello from the book store, we also have delivery by our car: "+car.getName();
    }

}

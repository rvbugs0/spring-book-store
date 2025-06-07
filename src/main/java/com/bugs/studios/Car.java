package com.bugs.studios;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private  String name;


    public Car(){
        this.name="Toyota Avalon";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}

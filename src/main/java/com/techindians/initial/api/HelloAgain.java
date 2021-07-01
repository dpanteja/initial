package com.techindians.initial.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAgain {

    @GetMapping
    public String simpleOne(){
        return "Welcome to Jenkins, Dude Bunny Dandi";
    }


}

package com.todorov.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by atodorov on 12/23/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to topic REST API";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi(){
        return "Hi";
    }
}

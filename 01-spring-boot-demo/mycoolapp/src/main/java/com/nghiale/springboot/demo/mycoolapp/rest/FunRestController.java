package com.nghiale.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class FunRestController {

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}

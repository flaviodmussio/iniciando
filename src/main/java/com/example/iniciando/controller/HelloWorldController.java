package com.example.iniciando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public void sayHello() {
        System.out.println("Hello World!");
    }
}

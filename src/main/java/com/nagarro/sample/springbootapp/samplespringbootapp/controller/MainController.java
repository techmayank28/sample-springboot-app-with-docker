package com.nagarro.sample.springbootapp.samplespringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String home() {
        return "Hello Mayank, This End point is working fine!!";
    }
}

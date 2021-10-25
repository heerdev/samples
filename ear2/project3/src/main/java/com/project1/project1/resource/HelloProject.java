package com.project1.project1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProject {

    @GetMapping("hello")
    public String helloProject(){
        return "Hello Project3";
    }
}

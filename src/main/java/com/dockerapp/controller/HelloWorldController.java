package com.dockerapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public String getMessage(){
        return "Hello-world Rajesh";
    }
}

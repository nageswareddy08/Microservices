package com.eureka.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nageswar on 8/16/2018.
 */
@RestController
public class GreetingController {
    @GetMapping("/")
    public String greeting(){
        return "Hello from" ;
    }
}

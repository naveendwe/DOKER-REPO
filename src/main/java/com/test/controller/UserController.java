package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUserName(){
        return "No record found";
    }
    @GetMapping("/address")
    public String getAddress(){
        return "Address not found";
    }
}

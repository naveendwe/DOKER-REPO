package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUserName(){
        return "Hello Docker now you are running fine :)";
    }
    @GetMapping("/address")
    public String getAddress(){
        return "Address not found";
    }
    @GetMapping("/marks")
    public String getMarks(){
        return "You obtained 75% out of 100%";
    }
    @GetMapping("/update")
    public String getPromot(){
        return "You will get promotion in the next year with 2025";
    }
}

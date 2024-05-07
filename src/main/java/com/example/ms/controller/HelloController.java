package com.example.ms.controller;

import com.example.ms.domain.User;
import com.example.ms.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/HelloWorld")
    public String HelloWorld(@RequestBody User user){
        return helloService.userLogin(user);
    }
}


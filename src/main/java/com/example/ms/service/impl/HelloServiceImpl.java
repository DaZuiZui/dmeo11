package com.example.ms.service.impl;

import com.example.ms.domain.User;
import com.example.ms.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String userLogin(User user) {
        if (user.getUsername().equals("test") && user.getPassword().equals("test")){
            return "ok";
        }
        return "password or username is error";
    }
}

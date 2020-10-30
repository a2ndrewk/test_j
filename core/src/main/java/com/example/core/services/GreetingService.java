package com.example.core.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String helloGreeting(String name) {
        return "Hello " + name;
    }
}

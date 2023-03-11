package com.arnoldkk.learnjenkins.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HelloService {

    public String sayHello(){
        log.info("Calling the Hello Service");
        return "Hello my friend";
    }
    
}

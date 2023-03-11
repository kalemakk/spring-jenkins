package com.arnoldkk.learnjenkins.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnoldkk.learnjenkins.services.HelloService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hello")
@Slf4j
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    public ResponseEntity<String> sayHello(){
        log.debug("Calling the Hello Controller");
        return ResponseEntity.ok(helloService.sayHello());
    }
    
}

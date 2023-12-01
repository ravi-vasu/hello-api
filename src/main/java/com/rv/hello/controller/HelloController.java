package com.rv.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome to Hello-Api!!!");
    }
}

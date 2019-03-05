package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PreAuthorize(value = "hasAnyRole('USER')")
    @GetMapping("a")
    public String a(){
        return "AA";
    }

    @PreAuthorize(value = "hasRole('ADMIN')")
    @GetMapping("b")
    public String b(){
        return "BBB";
    }

}

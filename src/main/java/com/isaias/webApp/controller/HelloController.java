package com.isaias.webApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello() {

        return "You know what the green grape told the purple grape? BREATHE boooooooooo...";
    }
}

package com.claretcloud.user_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping("/check")
    public String check() {
        return "<h1 style=\"color: green\">Server up and running</h1>";
    }

    @GetMapping("/hello")
    public String helloWord() {
        return "<h1 style=\"color: green\">Hello there.</h1>";
    }
}

package com.vishal.journal_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthCheck {

    @GetMapping("/check")
    public String healthcheck() {
        return "All is Well";
    }
}

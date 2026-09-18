package com.springbootbugtracker.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BugController {
    
    @GetMapping("/api/bugs")
    public String getBugs() {
        return "Hello from Bugtracker";
    }
}

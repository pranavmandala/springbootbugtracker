package com.springbootbugtracker.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.springbootbugtracker.entity.Bug;

import com.springbootbugtracker.service.BugService;

@RestController
@RequestMapping("/api/bugs")
public class BugController {

    private BugService bugService;

    public BugController(BugService bugService){
        this.bugService = bugService;
    }
    
    @PutMapping("/api/bugs")
    public Bug createBug(@RequestBody Bug bug){
        return bugService.addBugToData(bug);
    }

    
}

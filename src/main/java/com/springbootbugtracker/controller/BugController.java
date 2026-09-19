package com.springbootbugtracker.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.springbootbugtracker.entity.Bug;

import com.springbootbugtracker.service.BugService;

@RestController
public class BugController {

    private BugService bugService;

    public BugController(BugService bugService){
        this.bugService = bugService;
    }
    
    @PostMapping("/api/bugs/create")
    public Bug createBug(@RequestBody Bug bug){
        return bugService.addBugToData(bug);
    }

    @GetMapping("/api/bugs/{bugId}")
    public Bug getBug(@PathVariable Long bugId){
        return bugService.getBugFromData(bugId);
    }

    @DeleteMapping("/api/bugs/{bugId}")
    public ResponseEntity<Void> deleteBug(@PathVariable Long bugId){
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/api/bugs/{bugId}")
    public Bug updateBug(@PathVariable Long bugId, Bug bug){
        return bugService.updateBugInData(bugId, bug);
    }
}

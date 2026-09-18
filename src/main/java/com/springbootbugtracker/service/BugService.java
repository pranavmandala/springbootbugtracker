package com.springbootbugtracker.service;

import org.springframework.stereotype.Service;

import com.springbootbugtracker.repository.BugRepository;

@Service
public class BugService {
    
    private BugRepository bugRepository;

    public BugService(BugRepository bugRepository){
        this.bugRepository = bugRepository;
    }

}

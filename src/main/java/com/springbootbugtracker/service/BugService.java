package com.springbootbugtracker.service;
import org.springframework.stereotype.Service;
import com.springbootbugtracker.repository.BugRepository;
import com.springbootbugtracker.entity.Bug;

@Service
public class BugService {
    
    private BugRepository bugRepository;

    public BugService(BugRepository bugRepository){
        this.bugRepository = bugRepository;
    }

    public Bug addBugToData(Bug bug){
        return bugRepository.save(bug);
    }

}

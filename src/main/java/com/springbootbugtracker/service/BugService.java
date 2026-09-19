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

    public Bug getBugFromData(Long bugId){
        return bugRepository.getReferenceById(bugId);
    }

    public void deleteBugFromData(Long bugId){
        bugRepository.deleteById(bugId);
    }

    public Bug updateBugInData(Long bugId, Bug bug){
        Bug currbug = bugRepository.getReferenceById(bugId);
        currbug.setTitle(bug.getTitle());
        currbug.setDescription(bug.getDescription());
        currbug.setStatus(bug.getStatus());
        currbug.setPriority(bug.getPriority());
        return currbug;
    }

}

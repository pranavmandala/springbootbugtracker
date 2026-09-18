package com.springbootbugtracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootbugtracker.entity.Bug;

public interface BugRepository extends JpaRepository<Bug, Long>{

}

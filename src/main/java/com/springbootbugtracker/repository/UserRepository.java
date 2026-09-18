package com.springbootbugtracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootbugtracker.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}

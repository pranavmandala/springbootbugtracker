package com.springbootbugtracker.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, unique = true, nullable = false)
    private String username;

    @Column(length = 250, nullable = false)
    private String hashedPassword;

    public User() {
    }

    public User(String username, String hashedPassword) {
        this.setUsername(username);
        this.setHashedPassword(hashedPassword);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }
}
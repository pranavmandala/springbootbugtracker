package com.springbootbugtracker.entity;
import java.time.OffsetDateTime;
import jakarta.persistence.*;

@Entity 
@Table(name = "bugs")
public class Bug {

    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 200, nullable = false)
    private String title;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(length = 50, nullable = false)
    private String status;
    
    @Column(length = 50, nullable = false)
    private String priority;
    
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

/*     @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user; */
    
    public Bug() {

    }

    public Bug(String title, String description, String priority) {
        this.setTitle(title);
        this.setDescription(description);
        this.setStatus("open");
        this.setPriority(priority);
        this.createdAt = OffsetDateTime.now();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

/*     public void setUser(User user){
        this.user = user;
    } */

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getStatus(){
        return status;
    }

    public String getPriority(){
        return priority;
    }

    public OffsetDateTime getCreatedAt(){
        return createdAt;
    }

/*     public User getUser(){
        return user;
    } */
}

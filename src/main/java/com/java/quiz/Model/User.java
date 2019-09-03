package com.java.quiz.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Document(collection = "usr")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String userPic;
    private String email;
    private LocalDateTime lastVisit;
}

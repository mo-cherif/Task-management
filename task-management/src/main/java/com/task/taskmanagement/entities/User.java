package com.task.taskmanagement.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                // Exclude accessing tasks collection
                '}';
    }

}

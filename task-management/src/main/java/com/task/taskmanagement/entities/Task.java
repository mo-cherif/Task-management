package com.task.taskmanagement.entities;

import com.task.taskmanagement.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;
    private String description;
    private Status status;
    private Date date;
    private Boolean priority;

    @ManyToOne
    private User user;

}

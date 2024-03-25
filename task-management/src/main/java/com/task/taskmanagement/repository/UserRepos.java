package com.task.taskmanagement.repository;

import com.task.taskmanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, String> {
    User findByUsername(String username);
}

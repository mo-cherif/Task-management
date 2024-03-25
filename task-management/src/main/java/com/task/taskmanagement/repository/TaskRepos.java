package com.task.taskmanagement.repository;

import com.task.taskmanagement.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepos extends JpaRepository<Task, String> {
}

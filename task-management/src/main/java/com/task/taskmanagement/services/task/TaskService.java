package com.task.taskmanagement.services.task;

import com.task.taskmanagement.entities.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task);

    void delete(String id);

    List<Task> readAll();

    Task update(Task task, String id);

    Task readOne(String id);
}

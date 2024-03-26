package com.task.taskmanagement.services.task;

import com.task.taskmanagement.entities.Task;
import com.task.taskmanagement.repository.TaskRepos;

import java.util.List;

public class TaskServiceDefinition implements TaskService {
    private TaskRepos taskRepos;

    @Override
    public Task create(Task task) {
        return taskRepos.save(task);
    }

    @Override
    public Task delete(String id) {
        return null;
    }

    @Override
    public List<Task> readAll() {
        return null;
    }

    @Override
    public Task update(Task task, String id) {
        return null;
    }

    @Override
    public Task readOne(String id) {
        return null;
    }
}

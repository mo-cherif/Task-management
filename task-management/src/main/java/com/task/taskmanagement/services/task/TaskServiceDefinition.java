package com.task.taskmanagement.services.task;

import com.task.taskmanagement.entities.Task;
import com.task.taskmanagement.repository.TaskRepos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class TaskServiceDefinition implements TaskService {
    private TaskRepos taskRepos;

    @Override
    public Task create(Task task) {
        return taskRepos.save(task);
    }

    @Override
    public void delete(String id) {
        taskRepos.deleteById(id);
        System.out.println("Deletion completed");
    }

    @Override
    public List<Task> readAll() {
        return taskRepos.findAll();
    }

    @Override
    public Task update(Task task, String id) {
        Task taskupdated = taskRepos.findById(id).orElse(null);
        taskupdated.setDate(task.getDate());
        taskupdated.setTitle(task.getTitle());
        taskupdated.setDescription(task.getDescription());
        taskupdated.setUser(task.getUser());
        return taskRepos.save(task);
    }

    @Override
    public Task readOne(String id) {
        return taskRepos.findById(id).orElse(null);
    }
}

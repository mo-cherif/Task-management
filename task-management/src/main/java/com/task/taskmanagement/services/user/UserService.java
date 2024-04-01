package com.task.taskmanagement.services.user;

import com.task.taskmanagement.entities.User;

public interface UserService {
    User signup(User user);
    User getOne(String id);
    User signIn(String username);
}

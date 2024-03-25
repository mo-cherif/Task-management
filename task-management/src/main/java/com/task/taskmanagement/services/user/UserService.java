package com.task.taskmanagement.services.user;

import com.task.taskmanagement.entities.User;

public interface UserService {
    User signup(User user);
    User signIn(String username, String password);
}

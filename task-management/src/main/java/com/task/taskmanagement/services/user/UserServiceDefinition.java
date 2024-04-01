package com.task.taskmanagement.services.user;

import com.task.taskmanagement.entities.User;
import com.task.taskmanagement.repository.UserRepos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceDefinition implements  UserService{
    private UserRepos userRepos;

    @Override
    public User signup(User user) {
        User savedUser = userRepos.save(user);
        return savedUser;
    }

    @Override
    public User getOne(String id) {
        return userRepos.findById(id).orElse(null);
    }

    @Override
    public User signIn(String username) {
        User findedUser = userRepos.findByUsername(username);
        User user = findedUser;
        return user;
    }
}

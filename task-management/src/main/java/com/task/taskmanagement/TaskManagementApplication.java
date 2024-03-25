package com.task.taskmanagement;

import com.task.taskmanagement.entities.User;
import com.task.taskmanagement.repository.UserRepos;
import com.task.taskmanagement.services.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskManagementApplication  {
	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepos userRepos) {
		User user = userRepos.findByUsername("x");
		if (user != null) {
			System.out.println("****************** User Found\n" + user.toString());
		} else {
			System.out.println("User not found.");
		}
		return null;
	}
}

package com.task.taskmanagement;

import com.task.taskmanagement.entities.Task;
import com.task.taskmanagement.entities.User;
import com.task.taskmanagement.enums.Status;
import com.task.taskmanagement.repository.TaskRepos;
import com.task.taskmanagement.repository.UserRepos;
import com.task.taskmanagement.services.task.TaskService;
import com.task.taskmanagement.services.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class TaskManagementApplication  {
	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserService userService, TaskService taskService) {

//		User user = User.builder()
//				.password("123")
//				.username("mocherif")
//				.email("mocherifh0@gmail.com")
//				.tasks(new ArrayList<>())
//				.build();
//
//		Task task = Task.builder()
//				.date(new Date())
//				.description("cleaning house around 10 am")
//				.title("House cleaning")
//				.status(Status.PENDING)
//				.priority(true)
//				.build();
//
//		user.getTasks().add(task);
//		userService.signup(user);
//		taskService.create(task);

		Task taskToUpdate = taskService.readOne("e0e5e91a-dfe1-4444-9206-df6a88a906a5");
		User user = userService.getOne("4a522534-695a-4559-82f3-5924d9990431");
		taskToUpdate.setUser(user);
		taskService.update(taskToUpdate,"e0e5e91a-dfe1-4444-9206-df6a88a906a5");

		return null;
	}
}

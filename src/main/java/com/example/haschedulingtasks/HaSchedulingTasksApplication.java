package com.example.haschedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HaSchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaSchedulingTasksApplication.class, args);
	}

}

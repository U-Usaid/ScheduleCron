package com.ScheduleCron.ScheduleCron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ScheduleCronApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleCronApplication.class, args);
	}

}

package com.workintech.fswebs17d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FswebS17d1Application {
	@Value("${course.name}")
	private String courseName;

	@Value("${project.developer.fullname}")
	private String developerFullName;

	public static void main(String[] args) {
		SpringApplication.run(FswebS17d1Application.class, args);
	}
}

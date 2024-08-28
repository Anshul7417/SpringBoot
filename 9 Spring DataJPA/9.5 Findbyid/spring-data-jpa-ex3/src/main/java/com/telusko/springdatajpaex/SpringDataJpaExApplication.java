package com.telusko.springdatajpaex;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springdatajpaex.model.Student;

@SpringBootApplication

public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Optional<Student> s = repo.findById(103); // Optional is a container object means it can handle null values.
		System.out.println(s.orElse(new Student())); // It means if present then print otherwise return null object
	}

}

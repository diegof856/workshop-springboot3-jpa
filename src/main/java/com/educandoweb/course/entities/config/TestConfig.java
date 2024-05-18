package com.educandoweb.course.entities.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Diego Felipe", "diegofelipe@gmail.com","(81) 9 95871-5851", "12445747");
		User u2 = new User(null, "maria", "maria@gmail.com","(81) 9 94541-5851", "12445ada7");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}

package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
/**
 * CommandLineRunner
 * é uma interface da Spring Framework em Java que é usada para executar código durante a inicialização de uma aplicação Spring Boot.
 */

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired   // associa uma instancia do userRepository ao Test config
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}

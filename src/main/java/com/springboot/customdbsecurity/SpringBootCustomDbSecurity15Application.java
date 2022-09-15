package com.springboot.customdbsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.customdbsecurity.Repository.UsersRepository;

@SpringBootApplication
public class SpringBootCustomDbSecurity15Application implements CommandLineRunner {

	@Autowired
	private UsersRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomDbSecurity15Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}

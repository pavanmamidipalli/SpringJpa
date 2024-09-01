package com.example.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.repo.Repository;

@SpringBootApplication
public class SpringbootwithJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringbootwithJpaApplication.class, args);
	
		
	}
	@Autowired
	private Repository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new pavan3(101,"pavan","java"));
		repo.save(new pavan3(102,"xx","spring"));
		repo.save(new pavan3(103,"mm","springboot"));
		repo.save(new pavan3(104,"pp","javatool"));
		
	}  
	



}


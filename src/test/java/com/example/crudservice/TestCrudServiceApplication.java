package com.example.crudservice;

import org.springframework.boot.SpringApplication;

public class TestCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CrudServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.example.demo.Runnerr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Messagerunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO SPRING BOOT APP");
		System.out.println("Hello Modified");
		int a=10;
		int b=20;

	}

}

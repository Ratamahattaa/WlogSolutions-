package com.example.BackToTheFuture;

import SpringBoot.HelloController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class BackToTheFutureApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackToTheFutureApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {
			System.out.println("Test commandLi");
			
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName: beanNames){
				System.out.println(beanName);
			}
		};
	}

}



package com.user.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.user.test.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.user.test"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class UserTest {

	public static void main(String[] args) {
		SpringApplication.run(UserTest.class, args);
	}
}

package kr.ac.yyhighschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
public class DojeStudyForSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojeStudyForSpringBootApplication.class, args);
	}
}

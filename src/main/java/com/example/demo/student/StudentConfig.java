package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            
			Student paul = new Student(
				"Paul","paul@gmail.com",LocalDate.of(1990,Month.JANUARY,6)
			);
            Student emile = new Student(
				"Emile","emile@gmail.com",LocalDate.of(1991,Month.JANUARY,6)
			);

            repository.saveAll(List.of(paul, emile));

        };
    }
    
}

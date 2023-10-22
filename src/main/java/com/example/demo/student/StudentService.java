package com.example.demo.student;


import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
			new Student(
				1L,"Paul","paul@gmail.com",LocalDate.of(1990,Month.JANUARY,6),33
			)
		);
    } 
    
}

package com.example.demo.student;


import java.util.List;
import java.time.LocalDate;
import java.time.Month;

public class StudentService {
    public List<Student> getStudent() {
        return List.of(
			new Student(
				1L,"Paul","paul@gmail.com",LocalDate.of(1990,Month.JANUARY,6),33
			)
		);
    } 
    
}

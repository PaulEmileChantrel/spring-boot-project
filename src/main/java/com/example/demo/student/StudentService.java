package com.example.demo.student;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudent() {
        return studentRepository.findAll();
    } 

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail= studentRepository.findStudentByEmail(student.getEmail());

        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id " + studentId + " does not exists");
        }
        studentRepository.deleteById(studentId);
    
    }

    @Transactional
    public void updateStudent( Long id, String name, String email) {
       Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalStateException("Student with id " + id + " does not exists"));
       if (name != null && name.length() > 0 && !name.equals(student.getName())) {
           student.setName(name);
       }
       if (email != null && email.length() > 0 && !email.equals(student.getEmail())) {
           Optional<Student> studentByEmail = studentRepository.findStudentByEmail(email);
           if (studentByEmail.isPresent()) {
               throw new IllegalStateException("Email taken");
           }
           student.setEmail(email);
        }
    }
    
}

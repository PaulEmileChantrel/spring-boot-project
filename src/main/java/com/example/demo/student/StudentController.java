package com.example.demo.student;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    } 


    @PostMapping
    public void registerStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    

    } 
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        studentService.deleteStudent(id);
        }
    
    @PutMapping(path="{studentId}")
    public void updateStudent(@PathVariable("studentId") Long id, @RequestParam(required = false) String name, @RequestParam(required = false) String email) {
        studentService.updateStudent(id, name, email);
        } 

    

    public void getStudentById() {

    } 

    public void getStudentByEmail() {

    } 

    public void getStudentByPhone() {

    } 

    public void getStudentByAddress() {

    } 

    public void getStudentByCourse() {

    } 

    public void getStudentByYear() {

    } 

    public void getStudentByGender() {

    } 

    public void getStudentByStatus() {

    } 

    public void getStudentByAge() {

    } 

    public void getStudentByDob() {

    } 

    public void getStudentByBatch() {

    } 

    public void getStudentByBranch() {

    } 

    public void getStudentBySemester() {

    } 

    public void getStudentBySection() {

    }
    
}

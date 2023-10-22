package com.example.demo.student;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return this.studentService.getStudent();
    } 

    public void addStudent() {

    } 

    public void updateStudent() {

    } 

    public void deleteStudent() {

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

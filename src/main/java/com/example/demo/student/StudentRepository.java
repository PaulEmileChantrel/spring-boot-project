package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
    //@Query("SELECT s FROM Student s WHERE s.email = ?1") // (JPQL)
    Optional<Student> findStudentByEmail(String email); // <Student, Long>
}

package com.example.SpringBoot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}

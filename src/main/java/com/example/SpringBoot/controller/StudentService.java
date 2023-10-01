package com.example.SpringBoot.controller;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return java.util.List.of(
                new com.example.SpringBoot.controller.Student(
                        "Teik",
                        "Nguyen",
                        LocalDate.now(),
                        "ntk@gmail.com",
                        20
                ),
                new com.example.SpringBoot.controller.Student(
                        "kiet",
                        "Nguyen",
                        LocalDate.now(),
                        "ntk123@gmail.com",
                        20
                )
        );
    }
}

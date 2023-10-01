package com.example.SpringBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("im")
public class InMemoryStudentService implements StudentService{

    @Autowired
    private InMemoryStudentDao dao;



    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}

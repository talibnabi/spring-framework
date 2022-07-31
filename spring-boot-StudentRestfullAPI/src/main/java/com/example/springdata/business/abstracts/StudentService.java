package com.example.springdata.business.abstracts;

import com.example.springdata.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student createStudent(Student student);

    void deleteStudent(Integer id);

    Student updateStudent(Integer id, Student student);
}

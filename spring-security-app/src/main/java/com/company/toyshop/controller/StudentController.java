package com.company.toyshop.controller;

import com.company.toyshop.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Karim"),
            new Student(2, "Naz"),
            new Student(3, "Samira")
    );

    @GetMapping("{studentID}")
    public Student getStudent(@PathVariable("studentID") Integer studentID) {
        return STUDENTS.stream().filter(student -> studentID.equals(student.getStudentID())).findFirst().orElseThrow(() -> new IllegalArgumentException("Student " + studentID + " does not exists"));
    }
}

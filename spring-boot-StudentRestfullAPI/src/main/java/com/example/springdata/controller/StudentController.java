package com.example.springdata.controller;

import com.example.springdata.business.concretes.StudentManager;
import com.example.springdata.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentManager studentManager;

    @Autowired
    public StudentController(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAll() {
        return studentManager.getAll();
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentManager.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentManager.deleteStudent(id);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return studentManager.updateStudent(id, student);
    }
}

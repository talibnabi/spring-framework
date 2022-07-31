package com.example.springdata.business.concretes;

import com.example.springdata.business.abstracts.StudentService;
import com.example.springdata.dataAccess.abstracts.StudentDao;
import com.example.springdata.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManager implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentManager(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public Student updateStudent(Integer id, Student student) {
        Student student1 = studentDao.findById(id).orElseThrow(() -> new RuntimeException("User not found."));
        student1.setName(student.getName());
        student1.setSurname(student.getSurname());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setDateOfBirth(student.getDateOfBirth());
        return studentDao.save(student1);
    }
}

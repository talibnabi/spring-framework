package com.example.springdata.dataAccess.abstracts;

import com.example.springdata.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {

}

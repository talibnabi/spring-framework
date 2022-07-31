package com.example.springdata;

import com.example.springdata.dataAccess.abstracts.StudentDao;
import com.example.springdata.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(StudentDao studentDao) {
//        return args -> {
//            Student student = new Student(1, "Talib", "Nabiyev", 1, 2001);
//            studentDao.save(student);
//        };
//    }
}

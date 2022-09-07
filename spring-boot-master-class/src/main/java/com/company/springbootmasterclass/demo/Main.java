package com.company.springbootmasterclass.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Doctor doctor = new Doctor();
        doctor.assist();
    }
}

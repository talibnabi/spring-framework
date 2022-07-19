package az.spring.demo.impl;

import az.spring.demo.inter.Device;
import az.spring.demo.inter.Human;

import java.util.List;

public class Employee implements Human {
    public String name;
    public String surname;
    public Integer age;
    public Integer salary;
    public List<Device> hammers;

    public Employee() {
    }

    public Employee(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, Integer age, Integer salary, List<Device> hammers) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.hammers = hammers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public void setHammers(List<Device> hammers) {
        this.hammers = hammers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hammers=" + hammers +
                '}';
    }

    @Override
    public void send() {
        System.out.println("Products was sold.");
    }
}

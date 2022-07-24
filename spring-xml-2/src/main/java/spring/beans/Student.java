package spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private String name;
    @Autowired
    private Teacher teacher;

    public Student() {

    }

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void initStart() {
        System.out.println("Start");
    }

    public void initDestroy() {
        System.out.println("End");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

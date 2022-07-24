package spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Student;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        abstractApplicationContext.registerShutdownHook();
        Student user = abstractApplicationContext.getBean("student", Student.class);
        System.out.println(user);
    }
}

package az.spring.jdbc.main;

import az.spring.jdbc.config.SpringJdbcConfig;
import az.spring.jdbc.model.Employee;
import az.spring.jdbc.service.inter.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("beans/spring-config.xml");
        AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext("az.spring.jdbc");
        IEmployeeService employeeService = abstractApplicationContext.getBean("employeeService", IEmployeeService.class);
//        System.out.println( employeeService.getEmployeeById(1));
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setName("Narmina");
//        employee.setSurname("Kamil");
//        employee.setAge(22);
//        employee.setSalary(5400);
//        employee.setCountryName("Turkiye");
//        employeeService.insert(employee);
//        employeeService.update(employee);
//        employeeService.delete(1);
//        Employee employee = employeeService.getEmployeeById(4);
//        System.out.println(employee);
        System.out.println(employeeService.getAllEmployees());

    }
}

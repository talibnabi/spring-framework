package main;

import az.company.customer.service.impl.CustomerService;
import az.company.customer.service.inter.ICustomerService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        ICustomerService customerService=abstractApplicationContext.getBean("customerService", ICustomerService.class);
        System.out.println(customerService.getAllUser());
    }
}

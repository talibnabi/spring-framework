package spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.User;
import spring.dao.impl.UserDaoImpl;
import spring.dao.inter.UserDaoInter;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDaoImpl user = abstractApplicationContext.getBean("userDaoImpl", UserDaoImpl.class);
        user.showAllUser();
    }
}

package az.spring.demo.dao.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CarInfo carInfo = applicationContext.getBean("carInfo", CarInfo.class);
        carInfo.sendInfo();
    }
}

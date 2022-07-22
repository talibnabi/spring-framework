package az.spring.demo.dao.main;

import az.spring.demo.dao.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.registerShutdownHook();
//        Info carInfo = applicationContext.getBean("carInfo1", Info.class);
        Info carInfo2 = applicationContext.getBean("device-info", Info.class);
        carInfo2.sendInfo();
    }
}

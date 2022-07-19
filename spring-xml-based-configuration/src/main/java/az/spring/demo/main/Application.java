package az.spring.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Notification notification = applicationContext.getBean("notification", Notification.class);
        notification.alert();
        notification.alert();
    }
}

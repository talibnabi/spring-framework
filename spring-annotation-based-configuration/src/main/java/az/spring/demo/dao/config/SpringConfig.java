package az.spring.demo.dao.config;

import az.spring.demo.dao.impl.*;
import az.spring.demo.dao.main.Info;
import az.spring.demo.dao.service.Human;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "az.spring.demo")
public class SpringConfig {

}

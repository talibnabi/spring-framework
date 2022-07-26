package az.spring.jdbc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "az.spring.jdbc")
@PropertySource("db/database.properties")
public class SpringJdbcConfig {
//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName(driverClassName);
//        driverManagerDataSource.setUrl(url);
//        driverManagerDataSource.setUsername(username);
//        driverManagerDataSource.setPassword(password);
//        return driverManagerDataSource;
//    }
@Bean
public DataSource dataSource(DatabaseConfig databaseConfig) {
    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    driverManagerDataSource.setDriverClassName(databaseConfig.getDriverClassName());
    driverManagerDataSource.setUrl(databaseConfig.getUrl());
    driverManagerDataSource.setUsername(databaseConfig.getUsername());
    driverManagerDataSource.setPassword(databaseConfig.getPassword());
    return driverManagerDataSource;
}

    //
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
    @Bean
    public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}

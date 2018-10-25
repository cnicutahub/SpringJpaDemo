package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource testDataSource() {
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306");
        bds.setUsername("jdbc.username");
        bds.setPassword("jdbc.password");
        return bds;
    }

}
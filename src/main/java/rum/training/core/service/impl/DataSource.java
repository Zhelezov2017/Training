package rum.training.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import rum.training.core.dao.OrganizationDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class DataSource {
    private final String PATH = "classpath:";
    private final String URL = "spring.datasource.url";
    private final String DRIVER_CLASS_NAME = "spring.datasource.driver-class-name";
    private final String USERNAME = "spring.datasource.username";
    private final String PASSWORD = "spring.datasource.password";

    @PersistenceContext
    EntityManager entityManager;

    public javax.sql.DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(PATH + "src\\main\\resources\\application.yml")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dataSource.setUrl(properties.getProperty(URL));
        dataSource.setUsername(properties.getProperty(USERNAME));
        dataSource.setPassword(properties.getProperty(PASSWORD));
        return dataSource;
    }
}

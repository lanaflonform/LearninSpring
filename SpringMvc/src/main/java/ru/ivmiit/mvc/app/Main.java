package ru.ivmiit.mvc.app;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.ivmiit.mvc.dao.UsersDao;
import ru.ivmiit.mvc.dao.UsersDaoJdbcTemplateImpl;
import ru.ivmiit.mvc.models.User;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fix_users");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource); //datasource give connection

        List<User> users = usersDao.findAll();

        System.out.println(users);
    }
}

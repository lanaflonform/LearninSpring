package ru.ivmiit.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = "ru.ivmiit.service")
@EnableJpaRepositories(basePackages = "ru.ivmiit.service.repositories")
@EntityScan(basePackages = "ru.ivmiit.service.models")

public class Application {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
        }
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

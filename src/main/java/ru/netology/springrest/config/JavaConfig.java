package ru.netology.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springrest.controller.AuthorizationController;
import ru.netology.springrest.repository.UserRepository;
import ru.netology.springrest.service.AuthorizationService;

@Configuration
public class JavaConfig {

    @Bean
    public AuthorizationController authorizationController() {
        return new AuthorizationController();
    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

}

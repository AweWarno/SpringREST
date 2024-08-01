package ru.netology.springrest.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springrest.Controller.AuthorizationController;
import ru.netology.springrest.Repository.UserRepository;
import ru.netology.springrest.Service.AuthorizationService;

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

package com.hassan.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hassan.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {
    private List<User> users;
    
    @Bean
    public List<User> users() {
        users = new ArrayList<>();
        users.add(new User(1L, "Jose", "Loya"));
        users.add(new User(2L, "Andres", "Manuel"));
        users.add(new User(3L, "Camila", "Gonzalez"));
        users.add(new User(4L, "Snatiago", "Arzaga"));
        users.add(new User(5L, "Alex", "Piña"));
        return users;
    }
}

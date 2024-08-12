package com.hassan.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hassan.springboot.error.springboot_error.models.domain.User;

@Service
@Primary
public class UserServiceImpl implements UserService{

    private List<User> users;
    

    public UserServiceImpl() {
        users = new ArrayList<>();
        users.add(new User(1L, "Jose", "Loya"));
        users.add(new User(2L, "Andres", "Manuel"));
        users.add(new User(3L, "Camila", "Gonzalez"));
        users.add(new User(4L, "Snatiago", "Arzaga"));
        users.add(new User(5L, "Alex", "Piña"));
    }

    @Override
    public List<User> findAll() {
       return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.ofNullable(user);
            }
        }
        return null;
    }

}

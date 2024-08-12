package com.hassan.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hassan.springboot.error.springboot_error.models.domain.User;

@Service
@Primary
public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
       return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(urs -> urs.getId().equals(id)).findFirst();
        // for (User user : users) {
        //     if (user.getId().equals(id)) {
        //         return Optional.ofNullable(user);
        //     }
        // }
        // return null;
    }

}

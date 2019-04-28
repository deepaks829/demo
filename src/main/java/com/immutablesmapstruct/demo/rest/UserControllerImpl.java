package com.immutablesmapstruct.demo.rest;

import com.immutablesmapstruct.demo.dao.model.User;
import com.immutablesmapstruct.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public User getUser(int id) {
        return userService.findById(1);
    }

    @Override
    public User createUser(User user) {
        return userService.save(user);
    }
}

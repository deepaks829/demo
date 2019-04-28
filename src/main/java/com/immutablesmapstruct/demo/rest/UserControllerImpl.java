package com.immutablesmapstruct.demo.rest;

import com.immutablesmapstruct.demo.dto.model.UserDto;
import com.immutablesmapstruct.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public UserDto getUser(int id) {
        return userService.findById(1);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return userService.save(userDto);
    }
}

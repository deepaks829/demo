package com.immutablesmapstruct.demo.service;

import com.immutablesmapstruct.demo.dto.model.UserDto;
import org.springframework.stereotype.Service;

/**
 * User Repository that exposes CRUD operations.
 */
@Service
public interface UserService {
    UserDto findById(int id);
    UserDto save(UserDto userDto);
}

package com.immutablesmapstruct.demo.service;

import com.immutablesmapstruct.demo.dao.model.User;
import com.immutablesmapstruct.demo.dao.model.UserStatus;
import com.immutablesmapstruct.demo.dto.model.UserDto;
import org.springframework.stereotype.Service;

import static com.immutablesmapstruct.demo.dto.mapper.UserMapper.USER_MAPPER_INSTANCE;

/**
 * The business logic layer that depends on some Repository layer to perform database operations.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto findById(int id) {
        // Assume database get Operation
        final UserStatus userStatus = UserStatus.builder()
                .setId(1)
                .setStatus(1)
                .setStatusName("Active")
                .build();

        User userDao = User.builder()
                .setUsername("TestUser")
                .setEmail("TestUser@demo.com")
                .setUserStatus(userStatus)
                .build();

        return USER_MAPPER_INSTANCE.userDaoToDto(userDao);

    }

    @Override
    public UserDto save(UserDto userDto) {
        User userDao = USER_MAPPER_INSTANCE.userDtoToDao(userDto);

        // Assume database Save Operation on userDao

        return USER_MAPPER_INSTANCE.userDaoToDto(userDao);
    }
}

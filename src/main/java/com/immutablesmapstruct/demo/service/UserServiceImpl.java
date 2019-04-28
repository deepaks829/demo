package com.immutablesmapstruct.demo.service;

import com.immutablesmapstruct.demo.dao.model.User;
import com.immutablesmapstruct.demo.dao.model.UserStatus;
import org.springframework.stereotype.Service;

/**
 * The business logic layer that depends on some Repository layer to perform database operations.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findById(int id) {
        // Assume database get Operation
        final UserStatus userStatus = UserStatus.newBuilder()
                .withId(1)
                .withStatus(1)
                .withStatusName("Active")
                .build();

        return User.newBuilder()
                .withUsername("TestUser")
                .withEmail("TestUser@demo.com")
                .withUserStatus(userStatus)
                .build();
    }

    @Override
    public User save(User user) {
        // Assume database Save Operation
        final UserStatus userStatus = UserStatus.newBuilder()
                .withId(user.getUserStatus().getId())
                .withStatus(user.getUserStatus().getStatus())
                .withStatusName(user.getUserStatus().getStatusName())
                .build();

        return User.newBuilder()
                .withId(1)
                .withUsername(user.getUsername())
                .withEmail(user.getEmail())
                .withUserStatus(userStatus)
                .build();
    }
}

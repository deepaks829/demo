package com.immutablesmapstruct.demo.service;

import com.immutablesmapstruct.demo.dao.model.User;
import org.springframework.stereotype.Service;

/**
 * User Repository that exposes CRUD operations.
 */
@Service
public interface UserService {
    User findById(int id);
    User save(User user);
}

package com.immutablesmapstruct.demo.rest;

import com.immutablesmapstruct.demo.dto.model.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User controller defining the RestAPI endpoints
 */
@RestController
@RequestMapping("/users")
public interface UserController {

    @GetMapping("/{id}")
    UserDto getUser(@PathVariable int id);

    @PostMapping("/create")
    UserDto createUser(@RequestBody UserDto userDto);

}

package com.immutablesmapstruct.demo.dto.mapper;

import com.immutablesmapstruct.demo.dao.model.User;
import com.immutablesmapstruct.demo.dao.model.UserStatus;
import com.immutablesmapstruct.demo.dto.model.UserDto;
import com.immutablesmapstruct.demo.dto.model.UserStatusDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper USER_MAPPER_INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userDaoToDto(User user);

    //Problem here.
    User userDtoToDao(UserDto userDto);

    UserStatusDto userStatusDaoToDto(UserStatus userStatusDao);
    UserStatus userStatusDtoToDao(UserStatusDto userStatusDto);
}

package com.immutablesmapstruct.demo.dto.model;

public abstract class UserDto {

    public abstract int id();
    public abstract String username();
    public abstract String email();
    public abstract UserStatusDto userStatus();
    
}

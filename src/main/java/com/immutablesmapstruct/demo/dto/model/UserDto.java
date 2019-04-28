package com.immutablesmapstruct.demo.dto.model;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(defaults = @Value.Immutable(copy = false))
public abstract class UserDto {

    public abstract int id();
    public abstract String username();
    public abstract String email();
    public abstract UserStatusDto userStatus();

}

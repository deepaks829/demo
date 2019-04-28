package com.immutablesmapstruct.demo.dto.model;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(defaults = @Value.Immutable(copy = false))
public abstract class UserStatusDto {

    public abstract int id();
    public abstract int status();
    public abstract String statusName();

}

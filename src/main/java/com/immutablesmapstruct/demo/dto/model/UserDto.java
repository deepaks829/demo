package com.immutablesmapstruct.demo.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 * Immutable User DTO
 */
@Value.Immutable
@Value.Style(defaults = @Value.Immutable(copy = false), init = "set*")
@JsonSerialize(as = ImmutableUserDto.class)
@JsonDeserialize(builder = ImmutableUserDto.Builder.class)
public abstract class UserDto {

    @Value.Default
    @JsonProperty("id")
    public int getId() {
        return 0;
    }

    @JsonProperty("username")
    public abstract String getUsername();

    @JsonProperty("email")
    public abstract String getEmail();

    @JsonProperty("userStatus")
    public abstract UserStatusDto getUserStatus();

}

package com.immutablesmapstruct.demo.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(defaults = @Value.Immutable(copy = false), init = "set*")
@JsonSerialize(as = ImmutableUserDto.class)
@JsonDeserialize(builder = ImmutableUserDto.Builder.class)
public abstract class UserDto {

    @Value.Default
    @JsonProperty
    public int id() {
        return 0;
    }

    @JsonProperty
    public abstract String username();

    @JsonProperty
    public abstract String email();

    @JsonProperty
    public abstract UserStatusDto userStatus();

}

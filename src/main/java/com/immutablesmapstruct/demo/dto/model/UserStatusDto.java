package com.immutablesmapstruct.demo.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(defaults = @Value.Immutable(copy = false), init = "set*")
@JsonSerialize(as = ImmutableUserStatusDto.class)
@JsonDeserialize(builder = ImmutableUserStatusDto.Builder.class)
public abstract class UserStatusDto {

    @JsonProperty("id")
    public abstract int getId();

    @JsonProperty("status")
    public abstract int getStatus();

    @JsonProperty("statusName")
    public abstract String getStatusName();

}

package com.immutablesmapstruct.demo.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Status of user.
 * Example: Active or Inactive
 */
@JsonSerialize
@JsonDeserialize(builder = UserStatus.Builder.class)
public class UserStatus {
    // Primary Key. Something that is annotated with @Id
    @JsonProperty
    private int id;
    // A value of 1 or 0
    @JsonProperty
    private int status;
    // Active , InActive
    @JsonProperty
    private String statusName;

    private UserStatus(Builder builder) {
        id = builder.id;
        status = builder.status;
        statusName = builder.statusName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusName() {
        return statusName;
    }

    public static final class Builder {
        private int id;
        private int status;
        private String statusName;

        private Builder() {
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder withStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }

        public UserStatus build() {
            return new UserStatus(this);
        }
    }
}

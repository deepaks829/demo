package com.immutablesmapstruct.demo.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize(builder = User.Builder.class)
public class User {

    // Primary Key. Something that is annotated with @Id
    @JsonProperty
    private int id;
    @JsonProperty
    private String username;
    @JsonProperty
    private String email;
    @JsonProperty
    private UserStatus userStatus;

    private User(Builder builder) {
        id = builder.id;
        username = builder.username;
        email = builder.email;
        userStatus = builder.userStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public static final class Builder {
        private int id;
        private String username;
        private String email;
        private UserStatus userStatus;

        private Builder() {
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withUserStatus(UserStatus userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

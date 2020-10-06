package com.immutablesmapstruct.demo.dao.model;

/**
 * The user DAO
 */
public class User {

    // Primary Key. Something that is annotated with @Id
    private int id;
    private String username;
    private String email;
    private UserStatus userStatus;

    private User(Builder builder) {
        id = builder.id;
        username = builder.username;
        email = builder.email;
        userStatus = builder.userStatus;
    }

    public static Builder builder() {
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

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setUserStatus(UserStatus userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

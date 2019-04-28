package com.immutablesmapstruct.demo.dao.model;

/**
 * Status of user.
 * Example: Active or Inactive
 */
public class UserStatus {
    // Primary Key. Something that is annotated with @Id
    private int id;
    // A value of 1 or 0
    private int status;
    // Active , InActive
    private String statusName;

    private UserStatus(Builder builder) {
        id = builder.id;
        status = builder.status;
        statusName = builder.statusName;
    }

    public static Builder builder() {
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

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }

        public UserStatus build() {
            return new UserStatus(this);
        }
    }
}

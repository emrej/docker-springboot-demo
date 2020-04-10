package com.emrej.dockerspringbootdemo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "first_name", length = 30, updatable = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, updatable = false, nullable = false)
    private String lastName;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        return getId().equals(other.getId());
    }

}

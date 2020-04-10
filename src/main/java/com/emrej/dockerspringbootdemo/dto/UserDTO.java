package com.emrej.dockerspringbootdemo.dto;

import com.emrej.dockerspringbootdemo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * User DTO
 *
 * @author emrej on 2020-04-10
 */
@Builder
@Value
@AllArgsConstructor
public class UserDTO {

    String id;
    String firstName;
    String lastName;

    /**
     * Constructor from an entity
     *
     * @param user the user
     */
    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

}

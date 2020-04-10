package com.emrej.dockerspringbootdemo.service;

import com.emrej.dockerspringbootdemo.dto.UserDTO;
import com.emrej.dockerspringbootdemo.respository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User Service
 *
 * @author emrej on 2020-04-10
 */
@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    /**
     * Default constructor
     *
     * @param userRepository the user repository
     */
    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Lists all the users in DB
     */
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

}

package com.emrej.dockerspringbootdemo.controller;

import com.emrej.dockerspringbootdemo.dto.UserDTO;
import com.emrej.dockerspringbootdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User Controller
 *
 * @author emrej on 2020-04-10
 */
@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /**
     * Default constructor
     *
     * @param userService the user service
     */
    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

}

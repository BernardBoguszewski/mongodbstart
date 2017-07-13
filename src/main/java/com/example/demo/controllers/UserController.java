package com.example.demo.controllers;

import com.example.demo.domain.User;
import com.example.demo.dtos.UserDto;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Britenet on 2017-07-13.
 */
@RestController("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody UserDto userDto){
        userDto.validate();
        userService.createUser(userDto);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.listAllUsers();
    }
}

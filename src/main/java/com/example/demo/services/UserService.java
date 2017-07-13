package com.example.demo.services;

import com.example.demo.domain.User;
import com.example.demo.dtos.UserDto;
import com.example.demo.factories.UserFactory;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Britenet on 2017-07-13.
 */
@Service
public class UserService {

    private UserRepository userRepository;
    private UserFactory userFactory;

    public UserService(UserRepository userRepository, UserFactory userFactory) {
        this.userRepository = userRepository;
        this.userFactory = userFactory;
    }

    @Transactional
    public void createUser(UserDto userDto){
        User user = userFactory.create(userDto);
        userRepository.save(user);
    }

    @Transactional
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}

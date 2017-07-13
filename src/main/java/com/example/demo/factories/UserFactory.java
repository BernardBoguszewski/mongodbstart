package com.example.demo.factories;

import com.example.demo.domain.User;
import com.example.demo.dtos.UserDto;
import org.springframework.stereotype.Component;

/**
 * Created by Britenet on 2017-07-13.
 */
@Component
public class UserFactory {

    public UserFactory() {
    }

    public User create(UserDto userDto){
        return new User(userDto.getLogin(), userDto.getPassword(), userDto.getFirstName(), userDto.getLastName(),
                userDto.getEmail(), userDto.getPhoneNumber());
    }
}

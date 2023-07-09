package com.readystair.restservice.service;

import java.util.List;

import com.readystair.restservice.dto.AuthDto;
import com.readystair.restservice.dto.LoginDataDto;
import com.readystair.restservice.dto.UserDto;
import com.readystair.restservice.entities.User;

public interface UserService {

	User createUser(User user);

	UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
    
    LoginDataDto getlogin(AuthDto auth);
}

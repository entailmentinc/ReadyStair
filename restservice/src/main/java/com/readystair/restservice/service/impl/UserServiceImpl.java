package com.readystair.restservice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.readystair.restservice.dto.AuthDto;
import com.readystair.restservice.dto.LoginDataDto;
import com.readystair.restservice.dto.UserDto;
import com.readystair.restservice.entities.User;
import com.readystair.restservice.mapper.UserMapper;
import com.readystair.restservice.repository.UserRepository;
import com.readystair.restservice.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	private UserMapper userMapper;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        UserDto userDto = userMapper.mapUserToUserDto(optionalUser.get());
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {
    	
       // return userRepository.findAll();
        return null;
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getUserId()).get();
        existingUser.setEmpId(user.getEmpId());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setMiddleName(user.getMiddleName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        existingUser.setAddress(user.getAddress());
        existingUser.setPin(user.getPin());
        existingUser.setEmergencyPhone1(user.getEmergencyPhone1());
        existingUser.setEmergencyPhone2(user.getEmergencyPhone2());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

	@Override
	public LoginDataDto getlogin(AuthDto auth) {
		User loginUser = userRepository.findByUserName(auth.getUsername(), auth.getPassword());
		if (loginUser != null) {
			LoginDataDto loginData =  userMapper.mapUserToLoginDatdaDto(loginUser);
			return loginData;
		}
		return null;
	}
}

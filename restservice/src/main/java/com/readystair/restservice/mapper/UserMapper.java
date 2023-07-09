package com.readystair.restservice.mapper;

import com.readystair.restservice.dto.LoginDataDto;
import com.readystair.restservice.dto.UserDto;
import com.readystair.restservice.entities.User;

public class UserMapper {
	
	public UserDto mapUserToUserDto(User user) {
		
		UserDto userDto = new UserDto();
		
		userDto.setUserId(user.getUserId());
		userDto.setUserName(user.getUserName());
		userDto.setEmployeeId(user.getEmpId());
		userDto.setFirstName(user.getFirstName());
		userDto.setMiddleName(user.getMiddleName());
		userDto.setLastName(user.getLastName());
		userDto.setAddress(user.getAddress());
		userDto.setPin(user.getPin());
		userDto.setEmail(user.getEmail());
		userDto.setPhone(user.getPhone());
		userDto.setEmergencyPhone1(user.getEmergencyPhone1());
		userDto.setEmergencyPhone2(user.getEmergencyPhone2());
		
		return userDto;
	}
	
	public LoginDataDto mapUserToLoginDatdaDto(User user) {
		
		LoginDataDto loginData = new LoginDataDto();
		
		loginData.setUserId(user.getUserId());
		loginData.setUserType(user.getUserType());;
		
		return loginData;
	}

}

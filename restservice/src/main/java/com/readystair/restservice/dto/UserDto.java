package com.readystair.restservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
	
	private Long userId;
    
    private String userName;
    
    private String employeeId;
    
    private String firstName;
    
    private String middleName;
    
    private String lastName;
    
    private String email;
    
    private String phone;
    
    private String address;
    
    private Integer pin;
    
    private String emergencyPhone1;
    
    private String emergencyPhone2;

}

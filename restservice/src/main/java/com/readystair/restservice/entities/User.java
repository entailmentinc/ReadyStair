package com.readystair.restservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@NamedQueries({
	@NamedQuery(name = "findByUserName", query = "select u from User u where BINARY u.userName = ?1 and BINARY u.password = ?2")
})
public class User extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "emp_id")
    private String empId;
    
    @Column(name = "user_type")
    private String userType;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "pin")
    private Integer pin;
    
    @Column(name = "emergency_phone_1")
    private String emergencyPhone1;
    
    @Column(name = "emergency_phone_2")
    private String emergencyPhone2;
       
}

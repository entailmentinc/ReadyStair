package com.readystair.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.readystair.restservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserName(String userName, String password);

}

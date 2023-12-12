package com.api.hotel.repository;

import org.springframework.stereotype.Repository;

import com.api.hotel.entities.User;

@Repository
public class UserRepository {

	public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}

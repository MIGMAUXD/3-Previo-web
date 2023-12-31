package com.api.hotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String email;
	    private String password;
	    private String firstName;
	    private String lastName;

	    public User(String email, String password) {
	        this.email = email;
	        this.password = password;
	    }
}

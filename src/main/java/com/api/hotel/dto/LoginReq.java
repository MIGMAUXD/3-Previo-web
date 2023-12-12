package com.api.hotel.dto;

import lombok.Data;

@Data
public class LoginReq {

	private String email;
    private String password;
    
    public LoginReq(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

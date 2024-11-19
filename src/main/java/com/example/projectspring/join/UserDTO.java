package com.example.projectspring.join;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String id;
    private String password;
    private long phonenumber;
    private String email;

}
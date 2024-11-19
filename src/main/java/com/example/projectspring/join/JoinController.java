package com.example.projectspring.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daily")
public class JoinController {


    @Autowired
    private UserService userservice;

    
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userservice.registerUser(user);
        return "회원가입 성공!";
    }



    
   
}

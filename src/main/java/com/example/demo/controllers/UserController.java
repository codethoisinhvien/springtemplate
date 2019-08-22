package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.sercurity.CustomUserDetails;
import com.example.demo.sercurity.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UserController {
    @Autowired
    private JwtTokenProvider tokenProvider;
    @GetMapping
    public String getUserDetail(){
        User a = new User();
        a.setId((long) 1);
        String jwt = tokenProvider.generateToken(new CustomUserDetails(a));
        return jwt;
    }
    @PostMapping
    public String postUserDetail(){
        return "giang thân";
    }
}

package com.mstftikir.github.blog.services;

import com.mstftikir.github.blog.entities.UserInfo;
import com.mstftikir.github.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public void save(UserInfo user){
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    public UserInfo getUser(String username){
        return userRepository.findByUsername(username);
    }

    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }
}

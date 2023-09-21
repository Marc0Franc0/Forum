package com.app.Forum.security.service;

import com.app.Forum.security.model.UserEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public interface UserEntityService {
    //public UserEntity registerUser(RegisterDTO registerDTO);
    public User createUserSecurity(UserEntity userEntity);
    //public void authenticate(LoginDTO loginDTO);
}

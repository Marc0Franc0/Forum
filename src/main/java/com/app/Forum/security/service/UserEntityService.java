package com.app.Forum.security.service;

import com.app.Forum.security.dto.AuthDTO;
import com.app.Forum.security.model.UserEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
@Service
public interface UserEntityService {
    public UserEntity registerUser(AuthDTO authDTO);
    public User createUserSecurity(UserEntity userEntity);
    public void authenticate(AuthDTO authDTO);
}

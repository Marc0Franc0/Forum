package com.app.Forum.security.service;

import com.app.Forum.security.model.UserEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserEntityImpl implements UserEntityService{
    //Método para la creación de un usuario de seguridad de Spring
    @Override
    public User createUserSecurity(UserEntity userEntity) {
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.isEnabled(),
                userEntity.isAccountNonExpired(),
                userEntity.isCredentialsNonExpired(),
                userEntity.isAccountNonLocked(),
                userEntity.getAuthorities());
    }
}

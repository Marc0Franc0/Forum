package com.app.Forum.security.controller;

import com.app.Forum.security.dto.AuthDTO;
import com.app.Forum.security.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class SecurityController {
    @Autowired
    UserEntityService userEntityService;

    //Endpoint para poder registrarse y tener acceso a los endpoints del foro
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(AuthDTO authDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(userEntityService.registerUser(authDTO));
    }

    //Endpoint para iniciar sesión y obtener el token de autenticación
    //El mismo se complmenta con el filtro de autenticación
    public void authenticateUser(AuthDTO authDTO){
        userEntityService.authenticate(authDTO);
    }
}

package com.app.Forum.security.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AuthDTO {
    private String username;
    private String password;
}

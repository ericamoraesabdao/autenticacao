package com.example.autenticacao.Service;

import com.example.autenticacao.infra.security.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    JwtService jwtService;

    public String authentication(Authentication authentication){
        return jwtService.generateToken(authentication);
    }
}

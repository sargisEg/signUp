package com.signup.service.impl;

import com.signup.repository.UserRepository;
import com.signup.service.core.JwtService;
import com.signup.service.core.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JwtServiceImpl implements JwtService {

    private final UserService userService;

    public JwtServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String createToken(String username, List<String> role) {
        return "Bearer " + Jwts
                .builder()
                .signWith(SignatureAlgorithm.HS256, "12abc34")
                .claim("tokenId", UUID.randomUUID().toString())
                .claim("username", username)
                .claim("role", role)
                .compact();
    }
}

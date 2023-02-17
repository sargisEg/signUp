package com.signup.service.core;

import com.signup.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);
}

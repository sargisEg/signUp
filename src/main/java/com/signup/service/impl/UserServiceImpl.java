package com.signup.service.impl;

import com.signup.entity.User;
import com.signup.repository.UserRepository;
import com.signup.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(Long id) {
        Assert.notNull(id, "The id should not be null or empty");
        LOGGER.info("Finding user by id - {}", id);

        final Optional<User> optionalUser = userRepository.findById(id);

        LOGGER.info("Successfully found user by id - {}, result - {}", id, optionalUser);
        return optionalUser;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        Assert.hasText(username, "The username should not be null or empty");

        LOGGER.info("Finding user with username - {}", username);

        final Optional<User> optionalUser = userRepository.findByUsername(username);

        LOGGER.info("Successfully found user with username username - {}, result - {}", username, optionalUser);
        return optionalUser;
    }
}

package com.signup.service.impl;

import com.signup.entity.User;
import com.signup.entity.UserRole;
import com.signup.repository.UserRepository;
import com.signup.repository.UserRoleRepository;
import com.signup.service.core.UserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserRoleServiceImpl.class);

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public Optional<UserRole> findById(Long id) {
        Assert.notNull(id, "The id should not be null or empty");
        LOGGER.info("Finding user role by id - {}", id);

        final Optional<UserRole> optionalUserRole = userRoleRepository.findById(id);

        LOGGER.info("Successfully found user role by id - {}, result - {}", id, optionalUserRole);
        return optionalUserRole;
    }

    @Override
    public List<UserRole> findByUserId(Long id) {
        Assert.notNull(id, "The user id should not be null or empty");

        LOGGER.info("Finding user role with user id - {}", id);

        final List<UserRole> userRoleList = userRoleRepository.findByUserId(id);

        LOGGER.info("Successfully found user with user id - {}, result - {}", id, userRoleList);
        return userRoleList;
    }
}

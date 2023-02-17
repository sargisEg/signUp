package com.signup.service.core;

import com.signup.entity.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {

    Optional<UserRole> findById(Long id);

    List<UserRole> findByUserId(Long id);
}

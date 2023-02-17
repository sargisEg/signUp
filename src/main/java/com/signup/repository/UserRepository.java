package com.signup.repository;

import com.signup.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    User create(CreateUserParams params);

//    boolean checkCredentials(String username, String password);

    Optional<User> findByUsername(String username);

    Optional<User> findById(Long id);
}

package com.signup.security;

import com.signup.entity.User;
import com.signup.repository.UserRepository;
import com.signup.repository.UserRoleRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public DbUserDetailsService(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        final User byUsername = userRepository.getByUsername(username);
//
//
//        final List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(
//                new SimpleGrantedAuthority(
//                        userRoleRepository
////                                .getByUserId(byUsername.getId())
////                                .getUserRoleType().name()
//                )
//        );
//
//        return new org.springframework.security.core.userdetails.User(
//                byUsername.getUsername(),
//                byUsername.getPassword(),
//                authorities
//        );
    return null;
    }
}

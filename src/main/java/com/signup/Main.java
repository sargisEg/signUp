package com.signup;

import com.signup.entity.User;
import com.signup.entity.UserRole;
import com.signup.entity.UserRoleTypes;
import com.signup.repository.UserRepository;
import com.signup.repository.UserRoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(/*exclude = {SecurityAutoConfiguration.class}*/)
@EnableJpaRepositories
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
//
//        UserRepository userRepository = context.getBean(UserRepository.class);
//        UserRoleRepository userRoleRepository = context.getBean(UserRoleRepository.class);
//
//        final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//        final User s = new User("Sargis", passwordEncoder.encode("sargis123"));
//        userRepository.save(s);
//        userRoleRepository.save(new UserRole(s, UserRoleTypes.ROLE_WAITER));
//
//        final User v = new User("Vahe", passwordEncoder.encode("vava456"));
//        userRepository.save(v);
//        userRoleRepository.save(new UserRole(v, UserRoleTypes.ROLE_MANAGER));
    }
}
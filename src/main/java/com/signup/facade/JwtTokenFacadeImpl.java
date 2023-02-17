package com.signup.facade;

import com.signup.entity.User;
import com.signup.entity.UserRole;
import com.signup.facade.dto.TokenGenerationRequestDto;
import com.signup.facade.dto.TokenGenerationResponseDto;
import com.signup.service.core.JwtService;
import com.signup.service.core.UserRoleService;
import com.signup.service.core.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Component
public class JwtTokenFacadeImpl implements JwtTokenFacade {

    private final UserService userService;
    private final UserRoleService userRoleService;
    private final JwtService jwtService;

    private final PasswordEncoder passwordEncoder;

    public JwtTokenFacadeImpl(UserService userService, UserRoleService userRoleService, JwtService jwtService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.userRoleService = userRoleService;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public TokenGenerationResponseDto getToken(TokenGenerationRequestDto dto) {

        final Optional<User> optionalUser = userService.findByUsername(dto.getUsername());

        if (optionalUser.isEmpty()) {
            return new TokenGenerationResponseDto(List.of("Wrong credentials"));
        }

        User user = optionalUser.get();

        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            return new TokenGenerationResponseDto(List.of("Wrong credentials"));
        }

        final List<UserRole> userRoleList = userRoleService.findByUserId(user.getId());
        List<String> authorities = new LinkedList<>();
        userRoleList.forEach(userRole -> {
            authorities.add(userRole.getUserRoleType().name());
        });

        final String token = jwtService.createToken(
                user.getUsername(),
                authorities
        );
        return new TokenGenerationResponseDto(token);
    }
}

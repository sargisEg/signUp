package com.signup;

import com.signup.facade.JwtTokenFacade;
import com.signup.facade.dto.TokenGenerationRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private final JwtTokenFacade jwtTokenFacade;

    public TokenController(JwtTokenFacade jwtTokenFacade) {
        this.jwtTokenFacade = jwtTokenFacade;
    }

    @PostMapping()
    public ResponseEntity<String> token(@RequestBody TokenGenerationRequestDto tokenGenerationRequestDto) {

        return ResponseEntity.ok()
                .header("Authorization", jwtTokenFacade.getToken(tokenGenerationRequestDto).getToken())
                .body("Token");
    }

}

package com.signup.facade;

import com.signup.facade.dto.TokenGenerationRequestDto;
import com.signup.facade.dto.TokenGenerationResponseDto;

public interface JwtTokenFacade {

    TokenGenerationResponseDto getToken(TokenGenerationRequestDto dto);
}

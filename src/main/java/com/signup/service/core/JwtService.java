package com.signup.service.core;

import java.util.List;

public interface JwtService {

    String createToken(String username, List<String> role);

}


package com.signup.facade.dto;

import java.util.List;
import java.util.Objects;

public class TokenGenerationResponseDto {

    private String token;
    private List<String> errors;

    public TokenGenerationResponseDto(String token) {
        this.token = token;
    }

    public TokenGenerationResponseDto(List<String> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorResponseDto{");
        sb.append("token='").append(token).append('\'');
        sb.append(", errors=").append(errors);
        sb.append('}');
        return sb.toString();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TokenGenerationResponseDto that)) return false;
        return Objects.equals(token, that.token) && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, errors);
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}

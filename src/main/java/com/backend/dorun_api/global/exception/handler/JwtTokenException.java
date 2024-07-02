package com.backend.dorun_api.global.exception.handler;


import com.backend.dorun_api.global.code.ErrorCode;
import lombok.Builder;

public class JwtTokenException extends RuntimeException {

    private final ErrorCode errorCode;

    @Builder
    public JwtTokenException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @Builder
    public JwtTokenException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
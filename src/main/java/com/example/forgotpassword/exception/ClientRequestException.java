package com.example.forgotpassword.exception;

public class ClientRequestException extends RuntimeException{
    public ClientRequestException(String message) {
        super(message);
    }
}

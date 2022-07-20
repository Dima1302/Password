package com.example.password.exception;
public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }

}
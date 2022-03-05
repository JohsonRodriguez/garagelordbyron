package com.example.demo.exception;

public class UserRepositoryException extends RuntimeException{

    public UserRepositoryException(String message) {
        super(message);
    }
}
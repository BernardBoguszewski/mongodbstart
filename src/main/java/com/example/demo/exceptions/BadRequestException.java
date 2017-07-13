package com.example.demo.exceptions;

/**
 * Created by Britenet on 2017-07-13.
 */
public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
    }
}

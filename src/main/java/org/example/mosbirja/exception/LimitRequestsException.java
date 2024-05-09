package org.example.mosbirja.exception;

public class LimitRequestsException extends RuntimeException{
    public LimitRequestsException(String message) {
        super(message);
    }
}

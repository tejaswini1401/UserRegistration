package com.registration;

public class InvalidLastNameException extends RuntimeException {
	public InvalidLastNameException(String message) {
        super(message);
    }
}

package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.registration.UserRegistration;

class ValidateEmailId {

    UserRegistration obj = new UserRegistration();

    @ParameterizedTest
    @ValueSource(strings = {
        "valid.email@example.com",
        "user.name@domain.co",
        "user+name@domain.com",
        "user_name@domain.com",
        "user.name+tag+sorting@example.com"
    })
    void testValidEmails(String email) {
        assertTrue(obj.validEmail(email), "Email should be valid: " + email);
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "plainaddress",
        "missingatsign.com",
        "@missingusername.com",
        "username@.com"
    })
    void testInvalidEmails(String email) {
        assertFalse(obj.validEmail(email), "Email should be invalid: " + email);
    }
}

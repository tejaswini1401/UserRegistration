package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.registration.UserRegistration;

class TestCase {

	@Test
	void testFirstName() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.validFirstName("Tejaswini");
		assertTrue(result);
		System.out.println("Valid username");
	}
	@Test
	void testLastName() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.validLastName("Shelake");
		assertTrue(result);
		System.out.println("Valid LastName");
	}
	@Test
	void testEmailId() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.validEmailId("teja.shelake@abc.co.in");
		assertTrue(result);
		System.out.println("Valid EmailId");
	}
}

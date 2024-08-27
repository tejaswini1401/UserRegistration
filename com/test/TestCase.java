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
		boolean result1 = obj.validEmailId("teja.shelake@abc.co.in");
		boolean result2 = obj.validEmailId("teja.shelake@abc.com");
		boolean result3 = obj.validEmailId("shelake@abc.com");

		assertTrue(result1);
		assertTrue(result2);
		assertTrue(result3);
		System.out.println("Valid EmailId");
	}
	
	@Test
	void testMobileNumber() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.validMobileNumber("91 9028737812");
		assertTrue(result);
		System.out.println("Valid Mobile Number");
	}
	@Test
	void testPassword() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.validPassword("Tejaswini@123");
		
		assertTrue(result);
		System.out.println("Valid Password");
	}
	
	@Test
    void testInvalidEmails() {
		UserRegistration obj = new UserRegistration();
		boolean result1 = obj.validEmailId("teja.shelake");
		boolean result2 = obj.validEmailId("teja.shelake.com");
		boolean result3 = obj.validEmailId("shelake@abc@com");
		//boolean result4 = obj.validEmailId("shelake@abc..com");
		
		assertFalse(result1, "Email without '@' and domain should be invalid");
		assertFalse(result2, "Email without '@' before domain should be invalid");
		assertFalse(result3, "Email with multiple '@' should be invalid");
		//assertFalse(result4, "Email with multiple dots in domain should be invalid");
	}
	
	 @Test
	 void testInvalidMobileNumber() {
		 UserRegistration obj = new UserRegistration();

	     assertFalse(obj.validMobileNumber("9028737812"), "Mobile Number without country code should be invalid");
	     assertFalse(obj.validMobileNumber("91 90287378"), "Mobile Number with incorrect length should be invalid");
	     assertFalse(obj.validMobileNumber("91 90287378123"), "Mobile Number with too many digits should be invalid");
	 }
	 @Test
	 void testInvalidPassword() {
		 UserRegistration obj = new UserRegistration();

	     assertFalse(obj.validPassword("short"), "Password shorter than 8 characters should be invalid");
	     assertFalse(obj.validPassword("NoSpecialChar1"), "Password without special character should be invalid");
	     assertFalse(obj.validPassword("Multiple@Special@Char1"), "Password with multiple special characters should be invalid");
	     //assertFalse(obj.validPassword("NoUppercase1@"), "Password without uppercase letter should be invalid");
	     //assertFalse(obj.validPassword("NoLowercase1@"), "Password without lowercase letter should be invalid");
	    // assertFalse(obj.validPassword("NoDigit@"), "Password without digit should be invalid");
	 }
}

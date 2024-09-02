package com.test;
import com.registration.*;
import static org.junit.jupiter.api.Assertions.*;
import com.registration.*;

import org.junit.jupiter.api.Test;

import com.registration.UserRegistration;

class TestCase {
    UserRegistration obj = new UserRegistration();
    
    //First Name
	@Test
    void testValidFirstName() {
        assertDoesNotThrow(() -> obj.validateFirstName("Teja"));
    }
	@Test
    void testInvalidFirstName() {
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName("Teja123"));
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName(""));
    }
	
	//Last Name
	@Test
    void testValidLastName() {
        assertDoesNotThrow(() -> obj.validateFirstName("Shelake"));
    }
	@Test
    void testInvalidLastName() {
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName("Shelake123"));
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName(""));
    }
	
	//Email
	@Test
	void testValidEmails() {
        assertDoesNotThrow(() -> obj.validEmailId("teja@gmail.com"));
    }

	@Test
	void testInvalidEmails() {
        assertThrows(InvalidEmailException.class, () -> obj.validEmailId("abc@"));
        assertThrows(InvalidEmailException.class, () -> obj.validEmailId(""));
    }
	
	//Mobile Number
	@Test
    void testValidMobileNumber() {
        assertDoesNotThrow(() -> obj.validMobileNumber("91 9028737812"));
    }
	
	@Test
	void testInvalidMobileNumbers() {
	    assertThrows(InvalidMobileException.class, () -> obj.validMobileNumber("902873781"));
	    assertThrows(InvalidMobileException.class, () -> obj.validMobileNumber("91 90287378"));
	    assertThrows(InvalidMobileException.class, () -> obj.validMobileNumber("91 90287378123"));
	}
	
	//Password
	@Test
	void testPasswordforRule1() {
		boolean result = obj.validPasswordRule1("tejaswini");
		assertTrue(result);
		System.out.println("Valid Password");
	}
	
	@Test
	void testPasswordforRule2() {
		boolean result = obj.validPasswordRule2("Tejaswini");
		assertTrue(result);
		System.out.println("Valid Password");
	}
	@Test
	void testPasswordforRule3() {
		boolean result = obj.validPasswordRule3("Tejaswini14");
		assertTrue(result);
		System.out.println("Valid Password");
	}
	@Test
	void testPasswordforRule4() {
		boolean result = obj.validPasswordRule4("Tejaswini@123");
		assertTrue(result);
		System.out.println("Valid Password");
	}
	
    @Test
    void testValidPassword() {
        assertDoesNotThrow(() -> obj.validPassword("JohnDoe@123"));
    }
    
    @Test
    void testInvalidPassword() {
        assertThrows(InvalidPasswordException.class, () -> obj.validPassword("short"));
        assertThrows(InvalidPasswordException.class, () -> obj.validPassword("NoSpecialChar1"));
        assertThrows(InvalidPasswordException.class, () -> obj.validPassword("Multiple@Special@Char1"));
       // assertThrows(InvalidPasswordException.class, () -> obj.validPassword("NoUppercase1@"));
        //assertThrows(InvalidPasswordException.class, () -> obj.validPassword("NoLowercase1@"));
        //assertThrows(InvalidPasswordException.class, () -> obj.validPassword("NoDigit@"));
    }
	
}

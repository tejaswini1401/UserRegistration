package com.test;

import com.registration.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheckTestCaseForLamdaExpression{
    UserRegistrationUsingLamdaFunction obj = new UserRegistrationUsingLamdaFunction();
    
    // First Name Tests
    @Test
    void testValidFirstName() {
        assertDoesNotThrow(() -> obj.validateFirstName("Teja"));
    }

    @Test
    void testInvalidFirstName() {
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName("123"));
        assertThrows(InvalidFirstNameException.class, () -> obj.validateFirstName(""));
    }
	
    // Last Name Tests
    @Test
    void testValidLastName() {
        assertDoesNotThrow(() -> obj.validateLastName("Shelake"));
    }

    @Test
    void testInvalidLastName() {
        assertThrows(InvalidLastNameException.class, () -> obj.validateLastName("123"));
        assertThrows(InvalidLastNameException.class, () -> obj.validateLastName(""));
    }
    
    // Email Tests
    @Test
    void testValidEmails() {
        assertDoesNotThrow(() -> obj.validateEmail("teja@gmail.com"));
    }

    @Test
    void testInvalidEmails() {
        assertThrows(InvalidEmailException.class, () -> obj.validateEmail("abc@"));
        assertThrows(InvalidEmailException.class, () -> obj.validateEmail(""));
    }
    
    // Mobile Number Tests
    @Test
    void testValidMobileNumber() {
        assertDoesNotThrow(() -> obj.validateMobileNumber("91 9028737812"));
    }

    @Test
    void testInvalidMobileNumbers() {
        assertThrows(InvalidMobileException.class, () -> obj.validateMobileNumber("902873781"));
        assertThrows(InvalidMobileException.class, () -> obj.validateMobileNumber("91 90287378"));
        assertThrows(InvalidMobileException.class, () -> obj.validateMobileNumber("91 90287378123"));
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
        assertDoesNotThrow(() -> obj.validatePassword("JohnDoe@123"));
    }
    
    @Test
    void testInvalidPassword() {
    	  assertThrows(InvalidPasswordException.class, () -> obj.validPassword("short"));
          assertThrows(InvalidPasswordException.class, () -> obj.validPassword("NoSpecialChar1"));
          assertThrows(InvalidPasswordException.class, () -> obj.validPassword("Multiple@Special@Char1"));
       
    }
}

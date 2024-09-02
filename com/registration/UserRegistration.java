package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public void validateFirstName(String firstName) {
        if (firstName == null || !firstName.matches("^[A-Z]{1}[a-z]{2,}")) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }
	
	public void validateLastName(String lastName) {
        if (lastName == null || !lastName.matches("^[A-Z]{1}[a-z]{2,}")) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }
	public boolean validEmail(String emailId) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, emailId);
    }
	public void validEmailId(String emailId) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (emailId == null || !Pattern.matches(emailRegex, emailId)) {
            throw new InvalidEmailException("Invalid Email ID");
        }
    }
	public void validMobileNumber(String mobileNumber) {
		if (!Pattern.matches("^\\d{2} \\d{10}", mobileNumber)) {
	        throw new InvalidMobileException("Invalid Mobile Number");
	    }
	}
	
	public boolean validPasswordRule1(String password) {
		return Pattern.matches("^[a-z]{8,}",  password);
	}
	public boolean validPasswordRule2(String password) {
		return Pattern.matches("^[A-Za-z]{8,}",  password);
	}
	public boolean validPasswordRule3(String password) {
		return Pattern.matches("^[A-Za-z0-9]{8,}",  password);
	}
	public boolean validPasswordRule4(String password) {
		String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
		return Pattern.matches(exp,  password);
	}
	public void validPassword(String password) {
		String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
		if (!Pattern.matches(exp, password)) {
	        throw new InvalidPasswordException("Invalid Password");
	    }
	}
}

package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validFirstName(String firstName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}
	public boolean validLastName(String lastName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
	}
	public boolean validEmailId(String emailId) {
		return Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}", emailId);
	}
	public boolean validMobileNumber(String mobileNumber) {
		return Pattern.matches("^\\d{2} \\d{10}",  mobileNumber);
	}
	public boolean validPassword(String password) {
		String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
		return Pattern.matches(exp,  password);
	}
}

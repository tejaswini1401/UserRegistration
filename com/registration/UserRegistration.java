package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validFirstName(String firstName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
	}
}

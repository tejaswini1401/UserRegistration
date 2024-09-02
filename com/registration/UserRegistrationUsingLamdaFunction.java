package com.registration;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationUsingLamdaFunction {
	
	private static final Predicate<String> validateFirstName = firstName ->
		firstName == null || firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	
	private static final Predicate<String> validateLastName = lastName ->
		lastName == null || lastName.matches("^[A-Z]{1}[a-z]{2,}");

	
	private static final Predicate<String> validateEmailId = emailId -> {
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    return emailId == null || Pattern.matches(emailRegex, emailId);
	};
	private static final Predicate<String> validateMobileNumber = mobileNumber -> 
    Pattern.matches("^\\d{2} \\d{10}$", mobileNumber);
    
    

    private static final Predicate<String> validatePassword = password -> {
    	String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
    	return password != null || Pattern.matches(exp, password);
    };
   
    public void validPassword(String password) {
		String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
		if (!Pattern.matches(exp, password)) {
	        throw new InvalidPasswordException("Invalid Password");
	    }
	}
    
    public void validateFirstName(String firstName) {
        if (!validateFirstName.test(firstName)) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) {
        if (!validateLastName.test(lastName)) {
            throw new InvalidLastNameException("Invalid Last Name");
        }
    }

    public void validateEmail(String emailId) {
        if (!validateEmailId.test(emailId)) {
            throw new InvalidEmailException("Invalid Email ID");
        }
    }

    public void validateMobileNumber(String mobileNumber) {
        if (!validateMobileNumber.test(mobileNumber)) {
            throw new InvalidMobileException("Invalid Mobile Number");
        }
    }
    
    public boolean validPasswordRule1(String password) {
        return password != null && password.matches("^[a-z]{8,}$");
    }

    public boolean validPasswordRule2(String password) {
        return password != null && password.matches("^(?=.*[A-Z])[A-Za-z]{8,}$");
    }

    public boolean validPasswordRule3(String password) {
        return password != null && password.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,}$");
    }

    public boolean validPasswordRule4(String password) {
        String exp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d])(?!.*[^A-Za-z\\d].*[^A-Za-z\\d]).{8,}$";
        return password != null && Pattern.matches(exp, password);
    }

    public void validatePassword(String password) {
        if (!validatePassword.test(password)) {
            throw new InvalidPasswordException("Invalid Password");
        }
    }
}

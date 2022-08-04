package com.user.registration.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {

	// uc1
	@Test
	public void givenFirstNameWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.firstNameMatch("Umesh"));

	}

	// uc2
	@Test
	public void givenLastNameWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.lastNameMatch("Maurya"));

	}

	// uc3
	@Test
	public void givenEmailAddressWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.emailMatch("abc.xyz@bl.co.in"));
	}

	// uc4
	@Test
	public void givenMobileNumberWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.mobileMatch("+91 9919819801"));
		assertEquals(true, UserRegistrationProblem.mobileMatch("91 9919819801"));
	}

	// uc5
	@Test
	public void givenPasswordRule1WhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.passwordMatch1("billgate")); // should have minimum 8 character
	}

	// uc6
	@Test
	public void givenPasswordRule2WhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.passwordMatch2("BillgateOrg")); // should have at least 1 Uppercase
																					// character
	}

	// uc7
	@Test
	public void givenPasswordRule3WhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.passwordMatch3("Billgateorg3")); // should have at least 1 digit
	}

	// uc8
	@Test
	public void givenPasswordRule4WhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.passwordMatch4("Billgateorg3@")); // should have exactly 1 special
																						// character
	}

}

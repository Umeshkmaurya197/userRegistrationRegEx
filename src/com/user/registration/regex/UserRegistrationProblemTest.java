package com.user.registration.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {

	//uc1
	@Test
	public void givenFirstNameWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.firstNameMatch("Umesh"));
	
	}
	
	//uc2
	@Test
	public void givenLastNameWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.lastNameMatch("Maurya"));
		
	}
}

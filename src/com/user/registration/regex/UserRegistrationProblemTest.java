package com.user.registration.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {

	@Test
	public void givenFirstNameWhenEnteredShouldReturnTrue() {
		assertEquals(true, UserRegistrationProblem.firstNameMatch("Umesh"));
	
	}

}

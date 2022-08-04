package com.user.registration.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {

	@Test
	public void givenEmailsWhenPassedShouldReturnTrue(){
		
		assertEquals(true, UserRegistrationProblem.emailMatch("abc@yahoo.com")); //not passed yet
		
	}
}

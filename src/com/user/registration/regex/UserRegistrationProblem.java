package com.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	public static Matcher matcher;
	private static String firstNamePattern = "[A-Z][a-z]{3,}"; // First name starts with Cap and has minimum 3 characters
	private static String lastNamePattern = "[A-Z][a-z]{3,}"; // Last name starts with Cap and has minimum 3 characters
	// uc1

	public static boolean firstNameMatch(String firstName) {
		Pattern p = Pattern.compile(firstNamePattern);
		matcher = p.matcher(firstName);
		return matcher.matches();
	}

	// uc2
	public static boolean lastNameMatch(String lastName) {
		Pattern p = Pattern.compile(lastNamePattern);
		matcher = p.matcher(lastName);
		return matcher.matches();
	}

	public static void main(String[] args) {

		System.out.println("FirstName : " + firstNameMatch("Umesh"));//true
		System.out.println("LastName : " + firstNameMatch("Maurya"));//true
	}

}

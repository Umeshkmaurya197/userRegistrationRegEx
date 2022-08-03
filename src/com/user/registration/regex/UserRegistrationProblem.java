package com.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	public static Matcher matcher;
	private static String firstNamePattern = "[A-Z][a-z]{3,}"; // First name starts with Cap and has minimum 3 characters
	private static String lastNamePattern = "[A-Z][a-z]{3,}"; // Last name starts with Cap and has minimum 3 characters
	private static String emailPattern ="[a-zA-z0-9][a-zA-z0-9.]*@[a-z]+[.][a-z]{2}[.][a-z]+";  // abc.xyz@bl.co.in
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
	
	//uc3
	public static boolean emailMatch(String email) {
		Pattern p= Pattern.compile(emailPattern);
		matcher=p.matcher(email);
		return matcher.matches();
		
	}
	public static void main(String[] args) {

		System.out.println("First Name : " + firstNameMatch("Umesh"));//true
		System.out.println("Last Name : " + lastNameMatch("Maurya"));//true
		System.out.println("Email Address : " + emailMatch("abc.xyz@bl.co.in"));//true
	}

}

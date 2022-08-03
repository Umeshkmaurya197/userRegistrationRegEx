package com.user.registration.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	public static Matcher matcher;
	private static String firstNamePattern = "[A-Z][a-z]{3,}"; // First name starts with Cap and has minimum 3 characters
	private static String lastNamePattern = "[A-Z][a-z]{3,}"; // Last name starts with Cap and has minimum 3 characters
	private static String emailPattern = "[a-zA-z0-9][a-zA-z0-9.]*@[a-z]+[.][a-z]{2}[.][a-z]+"; // abc.xyz@bl.co.in
	private static String mobilePattern = "[+0-9]+\\s[0-9]{10}"; // 91 9919819801 or +91 9919819801
	private static String passwordPattern1 = "[A-Za-z0-9]{8,}";// rule1 ? minimum 8 Characters
	private static String passwordPattern2 = "^(?=.*[A-Z])(?=.*[a-z]{7,}).*"; // Should have at least 1 Upper Case
	private static String passwordPattern3 ="^(?=.*[A-Z])(?=.*[a-z]{7,})(?=.*[0-9]).*$";// Should have at least 1 digit
	private static String passowrdPattern4 ="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}]).*$";// Should have at exactly 1 special Character
	
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

	// uc3
	public static boolean emailMatch(String email) {
		Pattern p = Pattern.compile(emailPattern);
		matcher = p.matcher(email);
		return matcher.matches();

	}

	// uc4
	public static boolean mobileMatch(String moblieNumber) {
		Pattern p = Pattern.compile(mobilePattern);
		matcher = p.matcher(moblieNumber);
		return matcher.matches();
	}

	// uc5
	public static boolean passwordMatch1(String password) {
		Pattern p = Pattern.compile(passwordPattern1);
		matcher = p.matcher(password);
		return matcher.matches();
	}

	// uc6
	public static boolean passwordMatch2(String password) {
		Pattern p = Pattern.compile(passwordPattern2);
		matcher = p.matcher(password);
		return matcher.matches();
	}
	//uc7
	public static boolean passwordMatch3(String password) {
		Pattern p = Pattern.compile(passwordPattern3);
		matcher = p.matcher(password);
		return matcher.matches();
	}
	//uc8
	public static boolean passwordMatch4(String password) {
		Pattern p = Pattern.compile(passowrdPattern4);
		matcher = p.matcher(password);
		return matcher.matches();
	}
		
	public static void main(String[] args) {

		System.out.println("First Name : " + firstNameMatch("Umesh"));// true
		System.out.println("Last Name : " + lastNameMatch("Maurya"));// true
		System.out.println("Email Address : " + emailMatch("abc.xyz@bl.co.in"));// true
		System.out.println("Email Address : " + mobileMatch("+91 9919819801"));// true
		System.out.println("Password Match rule1 : " + passwordMatch1("billgateorg"));// true
		System.out.println("Password Match rule2 : " + passwordMatch2("BillgateOrg"));// true
		System.out.println("Password Match rule3 : " + passwordMatch2("Billgateorg3"));// true
		System.out.println("Password Match rule4 : " + passwordMatch2("Billgateorg3$"));// true
          
	}

}
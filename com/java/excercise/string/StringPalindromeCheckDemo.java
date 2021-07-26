package com.java.excercise.string;

public class StringPalindromeCheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="addda";
		StringPalindromeChecker checker = new StringPalindromeChecker();
		if (checker.checkPalindrome(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}

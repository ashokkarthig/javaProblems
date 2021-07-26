package com.java.excercise.string;

/**
 * <h1>StringPalindromeChecker</h1>
 * <p>
 * String Palindrome Checker class provides the implementation for palindrome
 * </p>
 * 
 * @author ASHOK G
 *
 */
public class StringPalindromeChecker {
	/**
	 * <h3>public static boolean checkPalindrome(String str)</h3>
	 * <p>
	 * checkPalindrome gets String as argument and check for palindrome string
	 * or not . If palindrome return true else false.
	 * </p>
	 * @param str
	 * @return boolean
	 */
	public static boolean checkPalindrome(String str) {
		int stringLength = str.length();
		char stringArray[] = str.toCharArray();
		for (int i = 0; i < stringLength / 2; i++) {
			if (stringArray[i] != stringArray[stringLength - i - 1]) {
				return false;
			}
		}
		return true;
	}
}

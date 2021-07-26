package com.java.excercise.string;

import java.util.HashMap;

/**
 * <h1>Alphabet Counter</h1> <br>
 * <p>
 * Alphabet Counter has the methods or implementation to count the number of
 * alphabets
 * </p>
 * 
 * @author ASHOK G
 */
public class AlphabetCounter {
	/**
	 * <h4>public HashMap<Character, Integer> countAlphabet(String str)</h4><br>
	 * <p>
	 * This is public method which simply get the string as parameter and count
	 * the occurrence of the each alphabet case sensitively. this stores the
	 * occurrence in hash map in key value pair concept and returns the Hashmap
	 * </p>
	 * 
	 * @param str
	 * @return HashMap<Character, Integer>
	 * 
	 */
	public HashMap<Character, Integer> countAlphabet(String str) {
		HashMap<Character, Integer> counter = new HashMap<>();
		for (int i = 65; i < 91; i++) {
			counter.put((char) i, 0);
		}
		for (int i = 97; i < 123; i++) {
			counter.put((char) i, 0);
		}
		char charArray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char key = charArray[i];
			if (Character.isAlphabetic(key)) {
				counter.put(key, counter.get(key) + 1);
			}
		}
		return counter;
	}

}

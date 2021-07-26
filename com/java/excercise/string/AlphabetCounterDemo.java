package com.java.excercise.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetCounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			HashMap<Character, Integer> counter = new AlphabetCounter().countAlphabet(str);
			for (Map.Entry<Character, Integer> pair : counter.entrySet()) {
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

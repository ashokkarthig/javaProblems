package com.java.excercise.oops;

/**
 * <h1>OverLoadingSample</h1>
 * <p>
 * OverLoading Sample provides the example for method overLoading.
 * </p>
 * <p>
 * It defines method for getting maximum number.
 * </p>
 * 
 * @author ASHOK G
 *
 */
public class OverLoadingSample {
	/**
	 * 
	 * <h1>private int max(int a, int b)</h1>
	 * <p>
	 * this method get two integer an argument and return the greatest integer
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * <h1>private int max(int a, int b,int c)</h1>
	 * <p>
	 * this method get three integer an argument and return the greatest integer
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	/**
	 * <h1>private int max(int[] array)</h1>
	 * <p>
	 * this method get array of integer an argument and return the greatest
	 * integer
	 * </p>
	 * 
	 * @param array
	 * @return
	 */
	private int max(int[] array) {
		int maxValue = 0;
		for (int itr = 0; itr < array.length; itr++) {
			if (array[itr] > maxValue) {
				maxValue = itr;
			}
		}
		return maxValue;
	}

	/**
	 * <h1>private double max(double a, double b)</h1>
	 * <p>
	 * this method get two double an argument and return the greatest double
	 * value
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * <h1>private double max(double a, double b,double c)</h1>
	 * <p>
	 * this method get three double an argument and return the greatest double
	 * value
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private double max(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	/**
	 * <h1>private double max(double array[])</h1>
	 * <p>
	 * this method get array of double an argument and return the greatest
	 * double value
	 * </p>
	 * 
	 * @param array
	 * @return
	 */
	private double max(double[] array) {
		double maxValue = 0;
		for (int itr = 0; itr < array.length; itr++) {
			if (array[itr] > maxValue) {
				maxValue = itr;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingSample obj = new OverLoadingSample();
		System.out.println("Method Over loading Sample : ");
		System.out.println("\nInteger Functions : ");
		System.out.println("Max of 20 and 32 : " + obj.max(20, 32));
		System.out.println("Max of 60,40 and 12 : " + obj.max(60, 40, 12));
		int array[] = { 11, 542, 33, 4 };
		System.out.println("Max number in array : " + obj.max(array));

		System.out.println("\nDouble Functions : ");
		System.out.println("Max of 20.5 and 3.2 : " + obj.max(20.5, 3.21));
		System.out.println("Max of 6.0,40 and 1.82 : " + obj.max(6.0, 40, 1.82));
		double arrays[] = { 1.1, 54.2, 33, 4.8 };
		System.out.println("Max number in array : " + obj.max(arrays));
	}

}

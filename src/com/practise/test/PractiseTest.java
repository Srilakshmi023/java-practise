package com.practise.test;

public class PractiseTest {

	public static void main(String[] args) {

		System.out.println("Hello World");
		PractiseTest myObj = new PractiseTest();
		int result = myObj.add(2, 3);
		System.out.println("Resullt is ==> \t" + result);

		// Call the method from here without creating objects
		System.out.println(bulliisMultiplying(3.24, 6.78));
		System.out.println(myObj.max(13, 15));

		System.out.println("The biegest among two number is \t==>" + Integer.max(13, 15));

	}

	public int max(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

	private static double bulliisMultiplying(double d, double e) {
		// TODO Auto-generated method stub
		return (d % e);

	}

	public int div(int i, int j) throws ArithmeticException {
		int res = 0;
		res = i / j;

		return res;
	}

	/*
	 * Non Static Method accessed through Objects
	 */
	public int add(int i, int j) {
		return i + j;
	}

	/*
	 * Create a static private method which takes two float number and returns
	 * result
	 */

}

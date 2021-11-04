package com.syntax.class09;

public class Hw04 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array

		int[] val = { 2, 4, 6, 7, 1 };

		int sum = 0;

		for (int n : val) {
			sum += n;

		}
		System.out.println(sum);

		System.out.println();
	}

}

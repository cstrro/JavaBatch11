package com.syntax.class09;

public class Hw02 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.

		String[] animals = { "Dog", "Elephant", "Fish", "Horse", "Lion", "Giraffe" };

		for (String ani : animals) {
			System.out.println(ani + " , ");

		}
		System.out.println();

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i] + " , ");
		}

	}

}

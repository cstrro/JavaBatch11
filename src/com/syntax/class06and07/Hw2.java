package com.syntax.class06and07;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		
		Scanner scan = new Scanner(System.in);
		int output = 0;
		System.out.println("Please enter first value");
		int num1 = scan.nextInt();
		System.out.println("Please enter second value");
		int num2 = scan.nextInt();
		System.out.println("Please enter operator you would like to use");
		char operator = scan.next().charAt(0);
		if (operator == '+') {
			output = num1 + num2;
		} else if (operator == '-') {
			output = num1 - num2;
		} else if (operator == '*') {
			output = num1 * num2;
		} else if (operator == '/') {
			output = num1 / num2;
		} else {
			System.out.println("Not valid");
		}
System.out.println("Based on operator provided the result is "+output);
	}

}

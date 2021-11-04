package com.syntax.class06and07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		
		
		
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your Grade");
		char grade = inp.next().charAt(0);
		String explanation;

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
			break;
		}

		if (!explanation.equals("Not Acceptable")) {
			System.out.println(grade + "-" + explanation);
		} else {
			System.out.println("Please enter another Grade");
		}

}
}
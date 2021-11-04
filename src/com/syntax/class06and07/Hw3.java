package com.syntax.class06and07;

public class Hw3 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
		int a = 1;
		while (a <= 100)
		{
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		// Print numbers from 100 to 1 
		int b = 100;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		// Print even numbers 20 to 100
		int c = 20;
		while (c <= 100) {
			System.out.print(c+" ");
			c += 2;
		}
		System.out.println();
		// Print odd numbers from 100 to 1
		int d = 100;
		while (d >= 1) {
			if (d % 2 != 0) {
				System.out.print(d + " ");
			} d--;
		}
	}
}

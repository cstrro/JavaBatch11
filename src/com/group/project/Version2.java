package com.group.project;

public class Version2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 621;
		boolean a = true;

		if (n > 1) {

			for (int i = 0; i < n; i++) {
				if (n % 2 == 0) {
					a = false;
					break;
				}

			}
		} else {
			a = false;
		}

		if (!a) {
			System.out.println(n + " is a prime number");
		} else {

			System.out.println(n + " is not a prime number");

		}

	}

}

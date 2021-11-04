package com.syntax.class06and07;

import java.util.Scanner;

public class GuessNumberWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		System.out.println("Please guess number. Between 1-100 ");
		userNumber=scan.nextInt();
		
		while (userNumber!=secretNumber) {
			System.out.println("Please guess the number, between 1-100");
			userNumber=scan.nextInt();
		}
		
		System.out.println("You got it");
		
		
	}

}

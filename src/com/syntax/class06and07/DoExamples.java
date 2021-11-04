package com.syntax.class06and07;

import java.util.Scanner;

public class DoExamples {

	public static void main(String[] args) {
		// Create a secret number 1-20
		// ask user to guess secret number
		// keep asking for a number till user guesses

		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		do { 
			System.out.println("Please guess my secret number, It is a number from 1 to 100");
			 userNumber=scan.nextInt();
			
		}while(userNumber!=secretNumber);
		
		System.out.println("You got it");	
		
		
	}

}


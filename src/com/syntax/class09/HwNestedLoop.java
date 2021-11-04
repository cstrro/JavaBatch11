package com.syntax.class09;

import java.util.Scanner;

public class HwNestedLoop {

	public static void main(String[] args) {
		// Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.

		Scanner scan = new Scanner(System.in);
		String answer;
		
		do { 
			System.out.println("Apply for a credit card");
			answer = scan.nextLine();
		
		}while (answer.equalsIgnoreCase("No"));
		System.out.println("Thanks");
		
	System.out.println("---------------------------------------------------------------------------");	
	
	// another way
	
	Scanner input=new Scanner(System.in);
	int num1=1;
	while(num1==1){
		System.out.println("Would you like to apply for a credit card? Yes/No");
		String card=input.nextLine();
		if(card.equalsIgnoreCase("yes")) {
			break;
		}
	}
	System.out.println("Ok, let's get you signed up!");
	
	
	
	
	}

}

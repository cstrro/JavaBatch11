package com.syntax.class04and05;

import java.util.Scanner;

public class LogOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card");
		
		String answer = input.next();
		
		if(answer.equals("yes") || answer.equals("yep") || answer.equals("yeah")) {
		 System.out.println("Please tell me the balance");
		
		}else {
			System.out.println("Do you want a card");
			
		
		
		}
		
		System.out.println("end of code");
		

	}

}

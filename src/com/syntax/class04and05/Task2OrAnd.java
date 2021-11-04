package com.syntax.class04and05;

import java.util.Scanner;

public class Task2OrAnd {

	public static void main(String[] args) {
		// Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday�?, anyday from 6-7 → output “It is a weekend�?, any other day → output “Invalid day�?
		
	   Scanner in=new Scanner(System.in);
		System.out.println("Please enter a number of day");
		
		int weekday=in.nextInt();
		
		if(weekday>=1 && weekday<=5) {
			System.out.println("Its a weekday");
		}else if(weekday>=6 && weekday<=7) {
			System.out.println("Its a weekend");
		}else { 
			System.out.println("Invalid day");
			
			
		}


	}

}

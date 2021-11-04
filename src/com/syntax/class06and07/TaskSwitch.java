package com.syntax.class06and07;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {
		// We need to capture a country from a user, based on country we have to define a favorite food
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a country");
		String count= scan.next();
		String food=null;
		

		switch (count.toLowerCase()) { 
		
		case "ukaraine":
			food="Borsh";
		 break;
		case"usa":
			food="burger";
		 break;
		case"italy":
			food="Pizza";
		 break;
		case"mexio":
		    food="Tacos";
		 break;
		default:
		    food="Unknown";
		}
		
		if (!food.equals("unknown")) {
		System.out.println("If your country is " + count + (" your favorite food is") + food);
		
		}
		
		
		


	}

}

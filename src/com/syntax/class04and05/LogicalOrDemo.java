package com.syntax.class04and05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/*
		 * ask user to enter today's day
		 * if monday or friday -> no class
		 * if tues and weds -> manual class 
		 * if thurs or sun -> java class
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Pleasae enter today's day");
		
		String day=scan.next();
		
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("No class today");
			
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase ("Wednesday")) {	
			System.out.println("Have manual class today");
		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("Java class today");
			
			
			
		}

	}

}

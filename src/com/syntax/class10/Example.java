package com.syntax.class10;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// Want to create an array and store elements using Scanner
		// String[] cars={};
		// String[] cars=new String[];
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements stored inside array of cars");
		
		int size=scan.nextInt();
		String[] cars=new String[size];
		// storing elements inside array
		for(int i=0; i<cars.length; i++) {
			System.out.println("Please enter your car");
			
			 cars[i] =scan.next();
			
			
		}

		//retrieve all stored elements
		for(String car:cars) {
			System.out.println(car+" ");
		}
		
		
		
		
	}

}

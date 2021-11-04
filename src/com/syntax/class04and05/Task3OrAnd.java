package com.syntax.class04and05;

import java.util.Scanner;

public class Task3OrAnd {

	public static void main(String[] args) {
		//Ask user to enter 3 numbers and define which is the largest number.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 number");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		
		if(num1==num2 && num1==num3) {
			System.out.println("Number are equal");
			
		} else { 

	
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1+" is larget number");
		}else if(num2>=num3 && num2>num1) {
			System.out.println(num2+" is largest number");
		}else if(num3>num2 && num3>=num1) {
			System.out.println(num3+" is largest number");
			
			
		}
		
		
		
		}

	}

}

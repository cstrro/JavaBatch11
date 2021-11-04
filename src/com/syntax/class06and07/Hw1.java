package com.syntax.class06and07;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		//Please complete this assignment in 2 ways: using if statement and switch case.
		
		System.out.println("Enter the first number");
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		System.out.println("Enter the second number");
		int n2=scan.nextInt();
		System.out.println("Enter the operation to use");
		char opt=scan.next().charAt(0);
		
		int addition=n1+n2;
		int subtraction=n1-n2;
		int multiplication=n1*n2;
		int divison=n1/n2;
	  int result = 0;
		
		switch(opt) {
		
		case '+':
			result=addition;
			break;
		
		case '-':
			result=subtraction;
			break;
		
		case '*':
			result=multiplication;
			break;
		case '/':
			result=divison;
			break;	
		}
		
		System.out.println(n1+""+opt+""+n2+"="+result);

	}

}

package com.syntax.class09;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.

		System.out.println("Please enetr two numbers");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of all even number is "+sumEven);
		System.out.println("The sum of all odd number is "+sumOdd);

		//--------------------------------------------------------------------------------------------------- 
		Scanner input=new Scanner(System.in);
		System.out.print("Please input the starting number: ");
		int start=input.nextInt();
		System.out.print("Please input the ending number: ");
		int end=input.nextInt();
		int even=0;
		int odd=0;
		for(int n1=start; num1<=end; num1++) {
			if(n1%2==0) {
				even+=n1;
			}else {
				odd+=n1;
			}
		}
		System.out.println("The sum off all the odd numbers is: "+odd);
		System.out.println("The sum of all the even numbers is: "+even);	
		
		
		
	}

}

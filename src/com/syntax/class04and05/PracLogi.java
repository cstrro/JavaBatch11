package com.syntax.class04and05;

import java.util.Scanner;

public class PracLogi {

	public static void main(String[] args) {
		/*
		 *  ask a user to enter a number
		 *  based on enter # we will define if number is small, M, OR L
		 *  
		 *  if number is between 1 and 10 -> S
		 *  if number is between 11 and 100 -> M
		 *  if number between 101 and 1000 -> L
		 *  if number is more than 1001 -> XL
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter any number");
		
		int num=in.nextInt();
		
		if (num<1) {
			System.out.println("Number is 0 or negative");
		}
		
		if (num>=1 && num<=10) {
			System.out.println(num+" is S");
		}else if(num>=11 && num<=100) {
			System.out.println(num+" is M");
		}else if(num>=101 && num<=1000) {
			System.out.print(num+" is L");	
		} else if (num>=1001) { 
			System.out.println(num+" is XL");
			
			
			
		}

	}

}

package com.syntax.class04and05;

import java.util.Scanner;

public class TaskAndOr1 {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your height");
		
		int num=in.nextInt();
		
		if (num<60) {
			System.out.println(num+"Under 60 inches");
		}else if(num>=60 && num<=72) {
			System.out.println(num+" between 60-72inches");
		}else if(num>72) {
			System.out.println(num+" over 72inch");
			
		}

	
		
		
		
		
	}

}

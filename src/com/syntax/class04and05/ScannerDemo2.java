package com.syntax.class04and05;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an item you want to buy");
		
		String item=input.next();// 1 word

		
		System.out.println("Please enter the price of the "+item);
        double price=input.nextDouble();
		
		System.out.println("You selected "+item+" with price ="+price );


		
		
	}

}

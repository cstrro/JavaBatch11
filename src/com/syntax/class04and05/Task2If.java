package com.syntax.class04and05;

public class Task2If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.Create a Java program and call it a Donor.
		double mr=4.6;
		double mp=100000;
	if(mr>4.5) {
				System.out.println("You cannot buy a house");
	}else { 
		System.out.println("You can buy a house");

		if(mp>200000) {
			System.out.println("Take a loan");
		}else { 
			System.out.println("pay cash");


		}
	}
	

	}

}

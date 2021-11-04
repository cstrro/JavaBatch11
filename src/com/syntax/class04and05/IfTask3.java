package com.syntax.class04and05;

public class IfTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In order to be eligible to donate your blood you have to be 18 years old. Also once you identify age eligibility then we have to see if person matches weight requirements. If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.
		int age=20;
		double weight=125;
		
		if (age>=18) {
			System.out.println("Eligible to donate");

		 if (weight>=110) {
			System.out.println("We can accept patient");
		} else {  
			System.out.println("We cannot accept patient");
		}
		
		} else {
			System.out.println("Not eligible to donate");
		
		}
		

	}

}

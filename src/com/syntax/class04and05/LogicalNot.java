package com.syntax.class04and05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean zoo=!false;
		System.out.println(zoo);
		
		boolean isRain=true;
		if(!isRain) {
			System.out.println("I will go for walk");
			
		}

		String username="Test";
		String password="Test";
		
		if(!username.equals(password)) {
			System.out.println("I am accpeting your password");
			
		}
		
		boolean selected=false;
		if (!selected) {
			System.out.println("do click");
		}
		
	}

}

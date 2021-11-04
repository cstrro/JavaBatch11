package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// nested loop is loop inside another loop

		for(int i=1; i<=3; i++) { //outer loop
			System.out.println("I am an outer");
			
			
			for( int j=1; j<=4; j++) { //inner
			System.out.println("I am an inner");
			}
		}
	System.out.println("End code");
	

	
	
	}

}

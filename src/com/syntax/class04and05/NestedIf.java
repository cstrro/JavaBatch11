package com.syntax.class04and05;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vaccine=true;
		
		int dose=1;
		
		if(vaccine) {
			System.out.println("How many doses have taken");
			
			if(dose==1) {
				System.out.println("When are you taking your 2nd dose?");
			}
		}

		String day="Friday";
		int date=13;
		int time=12;
				
		if(day.equals("Friday")) {
			System.out.println("I am going to the movies today");
		
		if(date==13) {
			System.out.println("I am watching a scary movie");
		}else { 
			System.out.println("I am watching a comedy today");
		}
		
		}else {
			System.out.println("I am going to study");
			
			if(time>23) {
				System.out.println("I have to sleep cause I have class");
			}
		}
		
	
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if( f == d ) {
		   if( f == i ) {
		      System.out.println("f, d and i are equal");
		    } else {
		      System.out.println("f, d are equal but i is not equal");
		    }

		} else {
		    System.out.println("f and d are not equal");
		}
	
		 
	          }

	    


		
		
	}



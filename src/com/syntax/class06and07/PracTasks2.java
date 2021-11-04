package com.syntax.class06and07;

public class PracTasks2 {

	public static void main(String[] args) {
		   //Print numbers from 1 to 100 in 1 line with space
           //Print numbers from 100 to 1
           //Print even numbers from 20 to 1 (2 ways)
           //Print odd numbers between 20 and 50 (2 ways)

		for(int i=1; i<=100; i++) {
		
			System.out.print(i + " ");
		}

        for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}

        for (int i = 20; i >= 1; i-=2) {
			System.out.print(i + " ");
		}
	System.out.println("-----");	
		
		for (int i = 20; i >= 1; i--) 
		
		if (i%2==0) {
			System.out.print(i + " ");
		}

        for (int b = 20; b <= 50; b+=2) {
			System.out.print(b + " ");
		}
	System.out.println("-----");	
		
		for (int i = 20; i <= 50; i++) 
		
		 if (i%2==0) {
			System.out.print(i + " "); 
		}
		
		}	
		
	}



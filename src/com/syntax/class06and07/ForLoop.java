package com.syntax.class06and07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("Print numbers from 1-20");

		
		for(int i=1; i<=20; i++) {
			System.out.println(i+" ");
		}
		
		
		
		
		System.out.println("Print number from 100 to 20");
		
		for(int i=1; i>=20; i--) {
			System.out.println(i +" ");
		}
		
		    System.out.println(" Print odd number 1-50");
		for(int i=1; i<=50; i++) {
			if (i%2 == 0) {
		    System.out.print(i+" ");
			}
		}
			System.out.println(" Print odd number 1-50");
		for(int i=2; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		
		   System.out.println();
		   System.out.println(" What is the output");
		 for(int i=1; i<=20; i+=5) {
			System.out.println(i+" ");
		}
		
	}
		
		
}



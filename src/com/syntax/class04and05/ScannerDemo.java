package com.syntax.class04and05;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// shortcut to import exist class to current, ctrl+shft+o
		
		String str="Abc";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
	String name=scan.next(); // capture string value
	
	System.out.println("Hello "+name);	

	System.out.println("Please enter your age");

	int age=scan.nextInt();

	System.out.println(name +" you are "+age+" years old");


	}
}

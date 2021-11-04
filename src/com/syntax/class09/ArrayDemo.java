package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1 way of array
		char[] grades = new char[6];
		
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';	
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
	
	System.out.println(grades[5]);
	//----------------------------------------------
	int num;//declare variable
	num=10;//initialize
	
	char[] gender; //declare array
	gender=new char[2]; //initialize size
		
	//2nd way of array
	
	char[] gradesArr= {'A','B','C','D'};
	
	System.out.println(gradesArr.length);
	System.out.println(gradesArr[3]);
	
	//================================
	
	String[] names= {"Luis", "LuisC", "Luiz", "LuizC"};
	names[0]="LuisCastro";
	
	System.out.println(names[0]);
	
	
	
	
	
	
	
	}

}

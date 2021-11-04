package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A', 'B', 'C', 'D', 'E'}; //Enhanced
		for(char grade:grades) {
			System.out.println(grade);
		}
	
		for(int i=grades.length-1; i>=0; i--) { //reverse
			System.out.println(grades[1]);
		}

	}

}

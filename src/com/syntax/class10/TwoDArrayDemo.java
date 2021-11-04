package com.syntax.class10;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// 2d array of groceries

		String[][] gro = { { "apple", "banana", "kiwi" }, { "potato", "tomato" },
				{ "milk", "cheese", "yogurt", "ayran" } };
		System.out.println(gro.length);
		
		// access yogurt
		System.out.println(gro[2][2]);

		// I want to find how many element my array 1 has
		System.out.println("Number of elements inside 1 array= " + gro[0].length);
		System.out.println("Number of elements inside 1 array= " + gro[1].length);
		System.out.println("Number of elements inside 1 array= " + gro[2].length);

		// how we get all elements from 2d array

		int total=0;
		for (int i = 0; i < gro.length; i++) { // iterates over arrays or rows
			for (int j = 0; j < gro[i].length; j++) { // iterates over 
				
			System.out.println(gro[i][j]+" ");
			total++;
			}
		
			System.out.println();
		
		
		}
		System.out.println("# of elements in total = " +total);		

	}

}

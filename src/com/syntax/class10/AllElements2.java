package com.syntax.class10;

public class AllElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers= {{100,200,300},{9,8,7}};
		System.out.println("Size of 2d array "+numbers.length);
		
		System.out.println(numbers[1][1]);//8
		
		System.out.println();
		//get all elements using for each loop
		
		for(int[] nums:numbers) {
			for(int num:nums) {
				System.out.println(num+" ");
			}
		System.out.println();
		}
		
		System.out.println(" get all elements using regular loop ");
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
			int	elements=numbers[i][j];
			System.out.print(elements+" ");
			
			
			}
		System.out.println();
		
		}
		
		
	}

}

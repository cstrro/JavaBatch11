package com.syntax.class09;

public class AllFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {100,200,300,400,500};
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+ " ");
			
			// to access all elements from array we use loop/advance or enhance
			
			for(int n:num) {
				System.out.println(n);
			}
			
			
		}
		
		String[] color= {"red", "blue", "white"};
		
		for(String c:color) {
			System.out.println(c);
		}
		
		
	}

}

package com.syntax.class08;

public class ContinueKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Hello"+i);
			
		}
	//I want to print numbers from 1 to 10 except number 3, 7 and 9
		
		for(int i=1; i<=10; i++) {
			
			if(i==3 || i==7 || i==9) {
				continue;
			}
			System.out.print(i+" ");
			
		}
		
		
		
		
		System.out.println("End of code");
	}

}

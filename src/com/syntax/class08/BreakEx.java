package com.syntax.class08;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=4; i++) {
			System.out.println("Almost done");
			
			break;
			
		}
		
		for(int i=0; i<=4; i++) {
			System.out.println("Almost done");
			
			if(i==3) {
				System.out.println("About to break loop");
				break;
			}
			
		}
		
		boolean summer=true;
		int  temp=75;
		while (summer) {
			System.out.println("I am happy, I love summer ");
			
			if(temp>100) {
				System.out.println("I dont love summer ");
				break;
			}

			temp+=5;
			
		}
	}

}

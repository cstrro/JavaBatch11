package com.syntax.class04and05;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean replComp=true;
		int assign=19;
		
		if(replComp) {
			System.out.println("Great Job");
		if(assign>16) {
			System.out.println("Amazing work");
		}else if (assign>10) {
			System.out.println("Good, but do more");
		}else if (assign>6) {
			System.out.println("Do more HW");
		}
			
		}else { 
			System.out.println("Please do your HW");	
		}

	}

}

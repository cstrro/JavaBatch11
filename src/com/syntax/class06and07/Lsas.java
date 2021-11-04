package com.syntax.class06and07;

public class Lsas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true;
		boolean y = false;
		if (x || y) {
		System.out.println(true);
		} else {
		System.out.println(false);
		}
		boolean male = false;
		int age = 30;

		if( male ){
		     if( age < 20 ){
		         System.out.println("Boy");
		     } else {
		         System.out.println("Man");

		    }
		}else {

		      if( age < 20 ){
		          System.out.println("Girl");
		       }else  {
		          System.out.println("Woman");
		      }
		}
		 boolean a, b, c;
	     a = b = c = true;

	          if( !a || ( b && c ) ) {
	             System.out.println("If executed");
	          } else {
	             System.out.println("else executed");
	         }

	    }
	

	    
	
	
	

}

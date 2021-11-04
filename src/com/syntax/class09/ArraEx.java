package com.syntax.class09;

public class ArraEx {

	public static void main(String[] args) {
		// Need to create array will hold 3 element of data type

		double[] arr= new double[3]; // storing 3 elements inside array we named arr
		
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		
		//can i replace value from an array
		arr[1]=100.99;
		
		System.out.println("After changing value of an element " +arr[1]);
		
		//want to create an array will store 4 colors
		
		String[] colors= new String[5];
		colors[0]="Red";
		colors[1]="Blue";
		colors[2]="Black";
		colors[3]="Yellow";
		colors[4]="Green";
		
		
		//See how many elements inside array
		System.out.println("Size of array is "+colors.length);
		
		System.out.println(colors[0]);
		
		
	}

}

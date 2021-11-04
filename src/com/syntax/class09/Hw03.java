package com.syntax.class09;

public class Hw03 {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order

	double[] num = new double[6];
		num[0] = 12.50;
		num[1] = 13.75;
		num[2] = 14.60;
		num[3] = 15.35;
		num[4] = 16.20;
		num[5] = 17.10;
		
		for( int i=num.length-1; i>+0; i--) {
			System.out.println(num[i]+ " ");
		}
		
		//another way
		// double[] n=new double[5];
		// n[0]=323.1;
		// n[1]=33.61;
		// n[2]=2.41;
		// n[3]=7.88;
		// n[4]=361.45;
		
		//for (int i=4; i>=0; i--) {
			// System.out.println(n[i]);
		
		// double[] nums={105.5,110.5,115.5,120.5,125.5};
		
		// for(int i=nums.length-1; i>=0; i--) {
			
			// System.out.println(nums[i]);
		
	}

}

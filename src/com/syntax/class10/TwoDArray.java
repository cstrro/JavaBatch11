package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] bigArr=new int[3] [3];
		
		//adding element inside 1 array or row 1
		bigArr[0][0]=10;
		bigArr[0][1]=20;
		bigArr[0][2]=30;
		
		//adding element inside 2 array or row 2
		bigArr[1][0]=1;
		bigArr[1][1]=2;
		bigArr[1][2]=3;
		
		//adding element inside 2 array or row 2
		bigArr[2][0]=100;
		bigArr[2][1]=200;
		bigArr[2][2]=300;
		

		//how to access
		System.out.println(bigArr[2][1]);//200
		//---------------------------------- another way
		
		int[][] arr= { {10,20,30},{1,2,3},{100,200,300}};
		
		
		
		
	}

}

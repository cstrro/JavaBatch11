package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: ?Saturday is Java coding Day?.
	
	String[] words= {"Java ", "Satuday ", "Coding ", "is ", "day "};

	System.out.println(words[1]+" "+ words[3]+ " "+ words[0]+ " "+ words[2]+ " " +words[4]);
	
	for(int i=0; i<words.length; i++) {
		System.out.println(words[i]);	
		}
	
	}

}

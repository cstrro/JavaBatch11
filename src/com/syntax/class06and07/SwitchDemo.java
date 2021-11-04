package com.syntax.class06and07;

public class SwitchDemo {

	public static void main(String[] args) {
		// Cant use logical operations or relational 
		
		char gender='m';
		String description;
		switch(gender) {
		
		case 'm':
		description="Male"; 
		break;
		case 'f':
		description="Female";
		break;
		default:
		description="Unknown";
		
		}
		
		System.out.println(gender +" means "+description);
		
		
		}

	}



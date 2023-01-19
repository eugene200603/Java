package com.lcpan.m08_1;

public class Greetings {
	public static void main(String[] args) {
		String[] greetings = { "Hello", "Hi! ", "Good" };
		try {
			for (int i = 0; i <= greetings.length; i++)
				System.out.println(greetings[i]);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index bound");
		}
		
		catch (Exception e) {	
		System.out.println("Exception happened");
		}
		
		System.out.println("Program end!");
	}
}

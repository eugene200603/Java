package com.lcpan.m04;

public class Factor {

/*	static int factorial(int x) {
		int x;
		for ( int i;i<=(i+1);i++) {
		return	x*=i;
		}
	}
	
	public static void main(String[] args) {
		int[] n= {4,5,6,10};
		for(int n;n>0;)
			factorial(int x);
	}
}
*/
	
	static int factorial(int num) {
		int result = 1;
		for(int i = num;i>=1;i--) 
			result*=i;
		return result;
	}
		
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(10));
		
		
		
	}
	}
package com.lcpan.m03;

public class Unity {

	public static void main(String[] args) {
		int x=3,y=4,z;
		//z=++x*y;
		//z=x++*y;
		//z=(x++)*y;
		//z=(x*y)++;
		z=x+++y;
		System.out.println("x="+x+",y="+y+",z="+z);
	}

}

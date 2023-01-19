package com.lcpan.m07;

public class StaticBlock {
	int num;
	static int count = 10;
//	static {
//		count = 10;
//	}

	public static void main(String[] args) {
	//	num++;
	//	System.out.println(num);
		StaticBlock sb= new StaticBlock();
		sb.num++;
		System.out.println(sb.num);
		count++;
		System.out.println(count);
	}
}

package com.lcpan.m06_1;

public class Parent {
	private int field1;
	
	public Parent() {
		
	}

	public Parent(int field1) {
		this.field1 = field1;
	}
	
	
	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}
	
	public void print() {
		System.out.println("field1="+field1);
	}

}

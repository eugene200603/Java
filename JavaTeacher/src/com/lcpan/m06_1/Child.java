package com.lcpan.m06_1;

public class Child  extends Parent{
  private int field2;
  
  
  public Child() {
		//super();   //JAVA自動加
	}
 
  
  public Child(int field1 , int field2) {
//		this.field1 = field1;
	    super(field1);
		this.field2 = field2;
	}
  
  public Child( int field2) {
	    super();
		this.field2 = field2;
		}
  
public int getField2() {
	return field2;
}

public void setField2(int field2) {
	this.field2 = field2;
}
  
  
  
public void print() {
	super.print();   //直接用父的print
//	System.out.println("field="+getField1()); //不好
	System.out.println("field2="+field2);
}
  
}

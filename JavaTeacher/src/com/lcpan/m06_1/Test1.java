package com.lcpan.m06_1;

public class Test1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.setField1(10);
	    p.print();
	    
	    Parent p1=new Parent(20);
	    p1.print();
	    
	    
	    Child c=new Child();
	    c.setField1(11);
	    c.setField2(22);
	    c.print();
	    
	    Child c1=new Child(100,200);
	    c1.print();
	    
	    Child c2=new Child(222);
	    c2.print();
 }
}

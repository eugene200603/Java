package com.lcpan.m06_1;

public class Test {
	public static void main(String[] args) {
		  Employee e = new Employee();
		  e.setEmpno(111);
		  e.setName("Tom");
		  e.printData();
		  System.out.print("empno = "+e.getEmpno());
	      System.out.println(", name = "+e.getName());
	    	 
		  
		  Employee e1 = new Employee(222,"Mary");
		  e1.printData();
	}
}

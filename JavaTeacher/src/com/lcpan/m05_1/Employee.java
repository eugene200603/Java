package com.lcpan.m05_1;

public class Employee {
     int empno;
     String name;
     
     
     public Employee() {
    	
     }
     
     public Employee(int empno,String name) {
    	 this.empno= empno;
    	 this.name= name;
     }
     
     
     public void printData() {
    	 System.out.print("empno = "+empno);
    	 System.out.println(", name = "+name);
    	 
     }
	public static void main(String[] args) {
	  Employee e = new Employee();
	  e.empno = 111;
	  e.name = "Tom";
	  e.printData();
	  Employee e1 = new Employee(222,"Mary");
	  e1.printData();
	  
	  
	}

}

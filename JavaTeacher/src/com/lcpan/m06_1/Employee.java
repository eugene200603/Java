package com.lcpan.m06_1;

public class Employee {
      private int empno;
      private String name;
     
     
     public Employee() {   //建構子(預設)
    	
     }
     
     public Employee(int empno,String name) { //建構子
    	 this.empno= empno;
    	 this.name= name;
     }
     
     
     public int getEmpno() {        //getter
    	 return empno;
     }
     
     public String getName() {    //getter
    	 return name;
     }
     
     public void setEmpno(int empno) {  //setter
    	 this.empno=empno;
     }
     
     public void setName(String name) {    //setter
    	 this.name=name;
     }
     
     
     
     
     public void printData() {
    	 System.out.print("empno = "+empno);
    	 System.out.println(", name = "+name);
    	 
     }
	
	  
	  
	

}

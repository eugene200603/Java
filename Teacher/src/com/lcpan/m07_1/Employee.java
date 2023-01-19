package com.lcpan.m07_1;

public class Employee {
	private int empno;
	private String name;
	private static int count;

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		count++;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}

	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee(111, "Tom");
		emps[1] = new Employee(222, "Mary");
		emps[2] = new Employee(333, "David");
		for (Employee emp : emps)
			emp.printData();
		System.out.println("employee count = " + Employee.getCount()); // 3
	}
}

package homework5_4;

public abstract class Staff extends Employee {
	 
	private int totalsalary;
	private int lunch=2400;
	private int salary;

	   
	  public Staff(String name,String sex,String date,String phone,String email,int salary) {
	   super(name,sex,date,phone,email);  
	   this.salary=salary;
	   }

public int getSalary() {
		return salary;
	}

public int totalsalary() {
	totalsalary=salary+lunch;
	return totalsalary;
}

}
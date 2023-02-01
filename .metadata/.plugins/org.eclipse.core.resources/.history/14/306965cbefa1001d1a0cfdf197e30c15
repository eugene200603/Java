package homework5;

public class Director extends Staff {
	private int performancebonus;
	private int transportation=3000;
	private int totalsalarydir;
	
	
	public Director(String name,String sex,String date,String phone,String email,int salary) {
		super(name,sex,date,phone,email,salary);
		
	}
	public void performancebonus() {
		performancebonus=(int)(getSalary()*1.2);
		
	}
	    
	
	public int totalsalary() {
		totalsalarydir=super.totalsalary()+performancebonus+transportation;
	    return totalsalarydir;
	  }
	public void printData() {
		super.printData();
		System.out.println(",薪資:"+totalsalary());
	}	


}

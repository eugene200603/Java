package homework5;

public class Seller extends Staff {
 private int salesbonus;
 private int totalsalarysell;	
    
	
	public Seller(String name,String sex,String date,String phone,String email,int salary) {
		super(name,sex,date,phone,email,salary);
		
	}

	public void salesbonus() {
		salesbonus=(int)(getSalary()*1.1);
		
	}
	
	
	public int totalsalary() {
		totalsalarysell=super.totalsalary()+salesbonus;
		return totalsalarysell;
		}
	
	public void printData() {
		super.printData();
		System.out.println(",薪資:"+totalsalary());
	}	
	
}

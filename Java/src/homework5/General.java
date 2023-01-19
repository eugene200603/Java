package homework5;

public class General extends Staff{

	public General(String name,String sex,String date,String phone,String email,int salary) {
		super(name,sex,date,phone,email,salary);
	}	
	public void printData() {
	super.printData();
	System.out.println(",薪資:"+totalsalary());
	}	
	
}

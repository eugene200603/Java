package homework5;

public class Temporary extends Employee {
	   
	   private int hourlywage;
	   private int time;
	   private int basicsalary=176;
	   
	   
	   
	  public Temporary(String name,String sex,String date,String phone,String email,int time) {
	   super(name,sex,date,phone,email);
	   this.time=time;
	   }
  
	  
	public int getHourlywage() {
		return hourlywage;
	}

	public void setHourlywage(int hourlywage) {
		this.hourlywage = hourlywage;
	}

	public int hourlywage() {	
		 
		hourlywage=basicsalary*time;
		return hourlywage;
	}
	
	    public void printData() {
	    super.printData();
		System.out.println(",薪資:"+hourlywage());
	}	
}

package com.lcpan.m05_1;

public class Account {
	String accountNo;
	double balance;
	
	
	public Account() {}
	
	public Account(String accountNo,double balance) {
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	
	public void printAccData() {
		System.out.println("accountNo="+ accountNo);
	    System.out.println("balance=" +balance );		
	}
	
	
	
	public static void main(String[] args) {
		Account a=new Account();
		a.accountNo="124654";
		a.balance=50000.0;
		a.printAccData();
		Account a1=new Account("123456",60000.0);
		a1.printAccData();
		
	}

}

package com.capgemini.assign4;

public class Account4_1 extends Person4_1 {
	long accNum;
	double balance;
	Person4_1 accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person4_1 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person4_1 accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amt)
	{
		balance+=amt;
		System.out.println("Deposit sucessfull...Remaining Balance"+balance);
		
	}
	public void withdraw(double amt)
	{
		balance-=amt;
		System.out.println("Withdraw Succesfull.. Available balance="+balance);
		
	}
	@Override
	public String toString() {
		return "Account4_1 [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + ", name=" + name
				+ ", age=" + age + "]";
	}
	

}

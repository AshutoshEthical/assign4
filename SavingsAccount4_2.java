package com.capgemini.assign4;

public class SavingsAccount4_2 extends Account4_1 {
	final double minBal=3000;
	public void withdraw(double amt)
	{
		if(balance-amt>minBal)
		{
		balance-=amt;
		System.out.println("Withdraw successfull.. Remaining balance= "+balance);
		}
		else
		{
			System.out.println("Not enough balance");
		}
	}
	

}

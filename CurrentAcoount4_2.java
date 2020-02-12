package com.capgemini.assign4;

public class CurrentAcoount4_2 extends Account4_1{
	double overDraftLimit=1000;
	public void withdraw(double amt)
	{
		if(amt>(balance+overDraftLimit))
				
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
			balance-=amt;
			System.out.println("Withdraw sucessful");
		}
	}

}

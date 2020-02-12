package com.capgemini.assign4;

public class AccountPerson4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account4_1 a1= new Account4_1();
		a1.setAccNum(10202);
		a1.setName("Smith");
		a1.setBalance(2000);
		Account4_1 a2= new Account4_1();
		a1.setAccNum(10203);
		a2.setName("Kathy");
		a2.setBalance(3000);
		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println("Smith balance"+a1.getBalance());
		System.out.println("Kathy balance"+a2.getBalance());
		System.out.println(a1);
		System.out.println(a2);
	}

}

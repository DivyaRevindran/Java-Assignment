package com.nissan.bean;

public class account {
	private double balance=0.0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount)
	{
		if(balance>amount)
		{
		this.balance=this.balance-amount;
		}
		else
		{
			System.out.println("Insufficient balance!");
		}
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	
}

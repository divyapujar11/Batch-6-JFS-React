package com.cg.Ex6;

public class Account 
{
	private String id;
	private String name;
	private int balance;
	
	public Account(String id,String name)
	{
		this.name=name;
		this.id=id;
		this.balance=0;
	}
	public Account(String id, String name, int balance)
	{
		//balance=0;
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount)
	{
		return amount+balance;
	}
	public int debit(int amount)
	{
		if(amount<=balance)
		{
			balance=amount-balance;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferTo(Account another,int amount)
	{
		if(amount<=balance) {
			another.balance=another.balance+amount;
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

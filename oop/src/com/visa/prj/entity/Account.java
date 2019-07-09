package com.visa.prj.entity;
/**
 * This is an entity class to represent 
 * account business data.
 * 
 * 
 * @author root
 * @version 1.0
 * 
 */
public class Account {
	private double balance; //state of object [ instance variable ]
	private String accNo;
	private static int count;
	
	public Account(String no) {
		count++;
		this.accNo = no;
	}
	/**
	 * method to credit amount into account
	 * 
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) { //converted to deposit(Account this, double amt)
		this.balance += amt;					// this.balance+= amt;
	}
	
	/**
	 * gives the status of the balance
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account other = (Account) obj;
		return this.accNo.equals(other.accNo);
	}
	
	public static int getCount() {
		return count;
	}
	
}

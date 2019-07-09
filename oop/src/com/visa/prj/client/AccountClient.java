package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SB110");
		Account sec = new Account("SB120");

		first.deposit(5000); // converted to deposit(first, 5000)
		sec.deposit(2500); // converted to deposit(sec, 2500)

		System.out.println("first account");
		System.out.println("Balance : " + first.getBalance());

		System.out.println("second account");
		System.out.println("Balance : " + sec.getBalance());

		System.out.println("********");

		Account rahul = new Account("SB100");
		Account swetha = new Account("SB100");

		Account ref = rahul;

		if (ref == rahul) {
			System.out.println("ref and rahu points to the same location");
		}

		if (rahul.equals(swetha)) {
			System.out.println("Same content!!");
		}

		System.out.println("Count : " + Account.getCount());
	}
}
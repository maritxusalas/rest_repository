package com;

public abstract class Bank {
	abstract void withdraw() ;
	
	void deposit() {
		System.out.println("DEPOSIT LOGIC PROVIDED BY BANK");
	}
}

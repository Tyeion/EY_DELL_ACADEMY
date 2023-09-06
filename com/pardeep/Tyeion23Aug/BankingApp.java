package com.pardeep.Tyeion23Aug;

class Customer{
	int amount=10000;
	 public synchronized void withdraw(int amount)
	 {
		 System.out.println("User has to come withdraw amount "+amount);
	 
	 
	 if(this.amount <amount)
	 {
		System.out.println("Less Balance, waiting to deposit ...");
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 this.amount -=amount;
	 System.out.println("Withdraw Completed...");
	 }
	 
	 public synchronized void deposit(int amount) {
		 System.out.println("User has come to deposit "+amount);
		 this.amount+=amount;
		 System.out.println("Deposit completed for amount "+ amount);
		 notify();
	 }
}

public class BankingApp {
  public static void main(String[] args) {
	final Customer c1=new Customer();
	new Thread() {
		public void run() {
			c1.withdraw(15000);
		}
	}.start();
	new Thread() {
		public void run() {
			c1.deposit(10000);
		}
	}.start();
}
}

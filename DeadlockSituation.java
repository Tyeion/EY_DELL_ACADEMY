package com.pardeep.Tyeion23Aug;

public class DeadlockSituation {
 public static void main(String[] args) {
	

	final String resource1 = "A";
	final String resource2 = "B";
	Thread t1= new Thread() {
		public void run() {
			synchronized (resource1) {
				System.out.println("Thread 1: Locked Resource");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized (resource2) {
				System.out.println("Thread1 :Looking for resource 2");
			}
			}
		}
	};
	
	Thread t2= new Thread() {
		public void run() {
			synchronized (resource2) {
				System.out.println("Thread 2: Locked Resource2");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized (resource1) {
				System.out.println("Thread2 :Looking for resource 1");
			}
			}
		}
	};
	t1.start(); t2.start();
 }	
}

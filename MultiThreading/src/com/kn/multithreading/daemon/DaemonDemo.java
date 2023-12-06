package com.kn.multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		//Instantidel thread objeect
		TypingCode t1=new TypingCode();
		SavingCode t2=new SavingCode();
		CompilingCode t3=new CompilingCode();
		
		//Set thread as daemon throw
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		//Start all threads
		t1.start();
		t2.start();
		t3.start();
	}

}

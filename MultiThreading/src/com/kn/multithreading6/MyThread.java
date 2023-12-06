package com.kn.multithreading6;

public class MyThread extends Thread {

	@Override
	public void run() {
		//Condition check based on current exection thread name
		if(Thread.currentThread().getName().equalsIgnoreCase("number")) {
			printNumber();
		}else {
			printCharacter();
		}
		
	}

	public void printCharacter() {
		System.out.println("===> Printing character Started");
		for(int i=65;i<=74;i++) {
			System.out.println((char)i);
		}
		System.out.println("===> Printing character Completed");
		
	}

	public void printNumber() {
		System.out.println("===> Printing number Started");
		for(int i=1;i<=10;i++) {
			System.out.println("****"+i);
		}
		System.out.println("===> Printing number Completed");
		
	}

}

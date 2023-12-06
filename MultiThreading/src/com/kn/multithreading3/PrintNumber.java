package com.kn.multithreading3;

public class PrintNumber extends Thread {

	@Override
	public void run() {
		
		
		for(int i=1;i<=20;i++) {
			System.out.println("The number = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
